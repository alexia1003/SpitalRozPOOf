package SpitalRoz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

abstract class Window0 extends JFrame {
    protected ArrayList<String> dataList;

    public Window0(ArrayList<String> dataList) {
        this.dataList = dataList;
    }

    protected abstract void writeDataToFile();

    public ArrayList<String> getDataList() {
        return this.dataList;
    }

    public void setDataList(ArrayList<String> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String data : this.dataList) {
            stringBuilder.append(data).append("\n");
        }
        return stringBuilder.toString();
    }
}
