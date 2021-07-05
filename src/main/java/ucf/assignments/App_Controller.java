package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;

public class App_Controller {

    public MenuItem File_Open, File_Save_Single, File_Save_All, File_Close, Edit_New_List, Edit_New_Item,
                    View_All, View_Completed, View_Incompleted, Help_Getting_Started, Help_About,
                    RC_List_Rename, RC_List_Delete, RC_Item_MComplete, RC_Item_MIncomplete, RC_Item_Rename,
                    RC_Item_Date, RC_Item_Delete;

    public void Open_Button_Click(ActionEvent actionEvent) {
        ucf.assignments.File_Open.run_open();
    }

    public void Save_Single_Button_Click(ActionEvent actionEvent) {
        File_Save.run_single_save();
    }

    public void Save_All_Button_Click(ActionEvent actionEvent) {
        File_Save.run_all_save();
    }

    public void Close_Button_Click(ActionEvent actionEvent) {
        ucf.assignments.File_Close.run_close();
    }

    public void New_List_Button_Click(ActionEvent actionEvent) {
        Edit.run_new_list();
    }

    public void New_Item_Button_Click(ActionEvent actionEvent) {
        Edit.run_new_item();
    }

    public void All_Button_Click(ActionEvent actionEvent) {
        View.run_view_all();
    }

    public void Completed_Button_Click(ActionEvent actionEvent) {
        View.run_view_yes();
    }

    public void Incompleted_Button_Click(ActionEvent actionEvent) {
        View.run_view_no();
    }

    public void Started_Button_Click(ActionEvent actionEvent) {
        Help.run_tutorial();
    }

    public void About_Button_Click(ActionEvent actionEvent) {
        Help.run_about();
    }

    public void list_rename_button_click(ActionEvent actionEvent) {
        List_Right_CLick.run_rename();
    }

    public void list_delete_button_click(ActionEvent actionEvent) {
        List_Right_CLick.run_delete();
    }

    public void mark_com_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_mark_yes();
    }

    public void mark_incom_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_mark_no();
    }

    public void item_rename_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_rename();
    }

    public void item_redate_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_redate();
    }

    public void item_delete_button_click(ActionEvent actionEvent) {
        Item_Right_Click.run_delete();

    }
}
