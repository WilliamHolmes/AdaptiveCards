// ObjectModelTest.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "ACParser.h"
#include "ACParseException.h"
#include "AdaptiveCard.h"
#include "TextBlock.h"
#include <memory>
#include <iostream>
#include <string>

using namespace std;
typedef  std::tuple< std::string, std::string> ParserTest;

int main(int argc, const char* argv[])
{
    std::vector<ParserTest> tests =
    {
        std::make_tuple("TestJsonFiles\\textblock_noUnicode.json", ""),
        //std::make_tuple("TestJsonFiles\\nounicode.json", ""),
        //std::make_tuple("TestJsonFiles\\test1.json", ""),
    };

    for (size_t i = 0; i < tests.size(); i++)
    {
        auto test = tests[i];
        std::string path = std::get<0>(test);
        const std::string expectedResult = std::get<1>(test);
        printf("Running test %zu, (%s, %s)\n", i, path.c_str(), expectedResult.c_str());
        try
        {
            auto result = AdaptiveCards::AdaptiveCard::DeserializeFromFile(path);
            if (!expectedResult.empty() || result == nullptr)
            {
                printf("  Failed test %zu, (%s, %s)\n", i, path.c_str(), expectedResult.c_str());
            }
            else
            {
                printf("  Passed test %zu, (%s, %s)\n", i, path.c_str(), expectedResult.c_str());
            }
        }
        catch (const AdaptiveCards::ACParseException& e)
        {
            printf("  Failed test %zu, (%s, %s)\n  ", i, path.c_str(), expectedResult.c_str());
            printf(e.what());
        }
        catch (...)
        {
            printf("  Failed test %zu, (%s, %s)\n", i, path.c_str(), expectedResult.c_str());
        }
    }


    return 0;
}