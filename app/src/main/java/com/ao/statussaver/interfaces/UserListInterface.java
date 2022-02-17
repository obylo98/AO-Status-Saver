package com.ao.statussaver.interfaces;


import com.ao.statussaver.model.FBStoryModel.NodeModel;
import com.ao.statussaver.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
