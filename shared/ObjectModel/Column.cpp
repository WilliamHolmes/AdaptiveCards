#include "Column.h"
#include "ParseUtil.h"
#include "Image.h"
#include "TextBlock.h"

using namespace AdaptiveCards;

Column::Column()
{
}

Column::Column(
    SeparationStyle separation,
    std::string speak,
    std::vector<std::shared_ptr<BaseCardElement>>& items) :
    Container(separation, speak, items)
{
}

Column::Column(
    SeparationStyle separation,
    std::string speak) :
    Container(separation, speak)
{
}

const CardElementType Column::GetElementType() const
{
    return CardElementType::Column;
}

std::string Column::GetSize() const
{
    return m_size;
}

void Column::SetSize(const std::string value)
{
    m_size = value;
}


std::string Column::Serialize()
{
    return "";
}

std::shared_ptr<Column> Column::Deserialize(const Json::Value& value)
{
    ParseUtil::ExpectTypeString(value, CardElementType::Column);

    auto container = BaseCardElement::Deserialize<Column>(value);

    // Parse Items
    auto cardElements = ParseUtil::GetElementCollection<BaseCardElement>(value, AdaptiveCardSchemaKey::Items, Container::CardElementParsers);
    container->m_items = std::move(cardElements);
    return container;
}