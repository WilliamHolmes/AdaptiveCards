export const CORTANA = `
* {
    box-sizing: border-box;
}

.cortanaLogo {
    width: 50px;
}

.title {
    width: 100%;
    text-align: center;
    margin-bottom: 10px;
}

.stretch {
    width: 100%;
}

.smallSize {
    width: 100px;
}

.mediumSize {
    width: 200px;
}

.largeSize {
    width: 300px;
}

.text {
    font-family: 'Segoe UI', sans-serif;
    font-size: 14px;
    font-weight: normal;
}

.text.startParagraph {
    padding: 20px 0px 0px 0px;
}

.text.defaultSize {
    font-size: 14px;
}

.text.small {
    font-size: 12px;
}

.text.medium {
    font-size: 20px;
}

.text.large {
    font-size: 24px;
}

.text.extraLarge {
    font-size: 30px;
}

.text.lighter {
    font-weight: 200;
}

.text.defaultWeight {
    font-weight: 400;
}

.text.bolder {
    font-weight: 600;
}

.text.defaultColor {
    color: rgb(255, 255, 255);
}

.text.defaultColor.subtle {
    color: rgba(51, 51, 51, 0.5);
}

.text.darkColor {
    color: rgb(255, 255, 255);
}

.text.darkColor.subtle {
    color: rgba(240, 240, 240, 0.5);
}

.text.lightColor {
    color: rgb(255, 255, 255);
}

.text.lightColor.subtle {
    color: rgba(255, 255, 255, 0.5);
}

.text.accentColor {
    color:  rgb(46, 137, 252);
}

.text.accentColor.subtle {
    color:  rgba(46, 137, 252, 0.5);
}

.text.goodColor {
    color: #2ccc35;
}

.text.warningColor {
    color: #f9a203;
}

.text.attentionColor {
    color: darkred;
}

.rootContainer {
    width: 300px;
    height: 300px;
    background: black;
    padding: 10px 12px;
}

.container {
    margin: 5px 0px 0px 0px;
}

.container.selectable {
    padding: 5px;
}

.container.selectable:hover {
    background-color: rgba(0, 0, 0, 0.1);
}

.container.selectable:active {
    background-color: rgba(0, 0, 0, 0.15);
}

.container.startGroup {
    border-top: 1px solid rgba(0, 0, 0, 0.25);
    padding-top: 5px;
}

.image {
    margin: 5px 0px 0px 0px;
}

.image.selectable {
    cursor: pointer;
}

.image.autoSize {
    max-width: 100%;
}

.image.stretch {
    width: 100%;
}

.image.small {
    max-width: 40px;
}

.image.medium {
    max-width: 80px;
}

.image.large {
    max-width: 160px;
}

.image.person {
    border-radius: 50%;
    background-position: 50% 50%;
    background-repeat: no-repeat;
}

table.factGroup {
    margin: 20px 0px 0px 0px;
    border-width: 0px;
    border-spacing: 0px;
    border-style: none;
    border-collapse: collapse;
}

tr.factGroupRowSpacer {
    height: 10px;
}

td.factName {
    border-width: 0px;
    padding: 0px;
    border-style: none;
    min-width: 100px;
    vertical-align: top;
    white-space: nowrap;
}

td.factValue {
    border-width: 0px;
    padding: 0px;
    border-style: none;
    vertical-align: top;
    padding: 0px 0px 0px 10px
}

.imageGallery {
    margin: 20px 0px 0px 0px;
}

.actionGroup {
    margin: 20px 0px 0px 0px;
}

.columnGroup {
    margin: 15px 0px 5px 0px;
}

.column {
}

.column.selectable {
    padding: 5px;
}

.column.selectable:hover {
    background-color: rgba(0, 0, 0, 0.1);
}

.column.selectable:active {
    background-color: rgba(0, 0, 0, 0.15);
}

.columnSpacer {
    width: 10px;    
}

.columnSpacer.startGroup {
    width: 20px;    
}

.columnSeparator {
    margin: 0 auto;
    width: 0px;
    height: 100%;
    border-left: 1px solid #EEEEEE;
}

.actionCardContainer {
    margin: 16px -20px 0px -20px;
    padding: 16px 20px 16px 20px;
    background-color: #F8F8F8;
}

.buttonStrip {
    display: flex;
    overflow: hidden;
}

.buttonStripItem {
    flex: 0 1 auto;
    white-space: nowrap;
    overflow: hidden;
}

.buttonStripItemSpacer {
    margin-right: 10px;
}

.pushButton {
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

.pushButton:hover {
    background-color: #005A9E;
}

.pushButton:active {
    background-color: #004D84;
}

/*
Other styles that can be specified:
    .pushButton.expanded
    .pushButton.expanded:hover
    .pushButton.expanded:active

    .pushButton.subdued
    .pushButton.subdued:hover
    .pushButton.subdued:active
*/

.linkButton {
    font-family: 'Segoe UI', sans-serif;
    font-size: 14px;
    font-weight: 600;
    overflow: hidden;
    text-overflow: ellipsis;
    cursor: pointer;
    border: none;
    padding: none;
    color: #0078D7;
    background-color: transparent;
    -webkit-user-select: none;   /* Chrome/Safari/Opera */
    -moz-user-select: none;      /* Firefox */
    -ms-user-select: none;       /* Internet Explorer/Edge */
    user-select: none;
}

.linkButton:hover {
    color: #005A9E;
}

.linkButton:active {
    color: #004D84;
}

.linkButton.subdued {
    color: #666666;
    font-weight: 500;
}

.linkButton.subdued:hover {
    color: #005A9E;
}

.linkButton.subdued:active {
    color: #004D84;
}

/*
Other styles that can be specified:
    .linkButton.expanded
    .linkButton.expanded:hover
    .linkButton.expanded:active
*/

.input {
    margin: 10px 0px 0px 0px;
}

.input.textInput {
    font-family: 'Segoe UI', sans-serif;
    font-size: 14px;
    border-color: #EAEAEA;
    border-width: 1px;
    border-style: solid;
    padding: 4px 8px 4px 8px;
    height: 30px;
    resize: none;
}

.input.textInput.multiline {
    height: 72px;
}

.input.number {
    font-family: 'Segoe UI', sans-serif;
    border-color: #EAEAEA;
    border-width: 1px;
    border-style: solid;
    padding: 4px 8px 5px 8px;
}

.input.date {
    font-family: 'Segoe UI', sans-serif;
    border-color: #EAEAEA;
    border-width: 1px;
    border-style: solid;
    padding: 4px 8px 5px 8px;
}

.input.time {
    font-family: 'Segoe UI', sans-serif;
    border-color: #EAEAEA;
    border-width: 1px;
    border-style: solid;
    padding: 4px 8px 5px 8px;
}

.input.multichoiceInput {
    font-family: 'Segoe UI', sans-serif;
    border-color: #EAEAEA;
    border-width: 1px;
    border-style: solid;
    padding: 4px 8px 6px 8px;
}

.toggleInput {
    display: inline-block;
    vertical-align: middle;
    margin: 0px;
}

.toggleLabel {
    margin-left: 6px ! important;
    margin-right: 0px ! important;
    margin-bottom: 0px ! important;
    padding: 0px ! important;
    display: inline-block;
    vertical-align: middle;
}
`;