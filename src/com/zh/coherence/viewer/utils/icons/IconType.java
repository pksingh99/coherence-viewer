package com.zh.coherence.viewer.utils.icons;

/**
 * Created by IntelliJ IDEA.
 * User: Живко
 * Date: 15.03.12
 * Time: 4:53
 */
public enum IconType {
    CLOSE_TAB("close-icon.gif"),
    EXIT("exit.png"),
    EXPLORER("explorer.png"),
    FUNCTION("function.png"),
    KEYWORD("keyword.png"),
    LOGIN("login.png"),
    OK("ok.png"),
    PLUS("plus.png"),
    START("start-icon.png"),
    TEXT("text-icon.png"),
    WHITE_HINT("white-hint-icon.png"),
    WRITE("write.png"),
    YELLOW_HINT("yellow-hint-icon.png"),
    BACKUP("backup.png"),
    MINUS("minus.png"),
    CLOCK_64("clock-icon.png"),
    SETTINGS("settings.png"),
    SAVE("save.png"),
    CSV_28("csv_icon.jpg"),
    EXCEL_28("excel_icon.jpg"),
    CHECK_ALL("check-all.png"),
    UN_CHECK_ALL("uncheck.png"),
    CLOCK("clock.png"),
    TICK_WHITE("tick-white.png"),
    CAMERA("camera.png"),
    CHART_UP("chart-up.png"),
    FILM("film.png"),
    ARROW_CIRCLE_DOUBLE("arrow-circle-double.png"),
    CLUSTER("cluster.png"),
    SCRIPTS("scripts.png"),
    CLIPBOARD_TEXT("clipboard-text.png"),
    REPORT("report.png"),
    NODE("node.png"),
    DATABASE("database.png"),
    SERVER_NETWORK("server-network.png")
    ;

    private String type;

    private IconType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
