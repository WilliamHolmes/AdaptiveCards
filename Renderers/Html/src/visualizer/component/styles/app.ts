export const APP = `
body {
    font-family: 'Segoe UI', sans-serif;
    font-size: 14px;
    font-weight: normal;
    height: 100vh;
    margin: 0;
    padding: 0;
}

.uiRoot {
    display: flex;
    flex-flow: column;
    height: inherit;
}

.uiHeader {
    flex: 0 0 auto;
    padding: 10px;
    background-color: #EAEAEA;
}

.uiFooter {
    flex: 0 0 auto;
    margin: 0px 10px 10px 10px;
}

.cardEditor {
    display: flex;
    height: 100%;
    min-height: 0;
    margin: 10px;
}

.leftPane {
    display: flex;
    flex-flow: column;
    flex: 1 1 50%;
    overflow: auto;
    margin-right: 10px;
}

.rightPane {
    flex: 1 1 50%;
    overflow: auto;
    margin-left: 10px;
}

div.markupRender {
    margin-right: 20px;
    margin-bottom: 20px;
}

#editor {
    flex: 1 1 auto;
    box-sizing: border-box;
    resize: none;
    white-space: nowrap;
    overflow: auto;
    border: 1px solid #F1F1F1;
}

.button {
    font-family: 'Segoe UI', sans-serif;
    font-size: 14px;
    font-weight: 600;
    overflow: hidden;
    text-overflow: ellipsis;
    border: none;
    padding: 4px 10px 5px 10px;
    min-width: 80px; 
    text-align: center;
    vertical-align: middle;  
    cursor: default;
    background-color: #0078D7;
    color: white;    
    -webkit-user-select: none;   /* Chrome/Safari/Opera */
    -moz-user-select: none;      /* Firefox */
    -ms-user-select: none;       /* Internet Explorer/Edge */
    user-select: none;
}

.button:hover {
    background-color: #005A9E;
}

.button:active {
    background-color: #004D84;
}

select {
    font-family: 'Segoe UI', sans-serif;
    font-size: 14px;
    border-color: #DDDDDD;
    border-width: 2px;
    border-style: solid;
    padding: 2px 3px 3px 3px;
}
`;