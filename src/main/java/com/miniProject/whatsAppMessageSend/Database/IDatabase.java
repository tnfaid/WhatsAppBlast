package com.miniProject.whatsAppMessageSend.Database;

import com.miniProject.whatsAppMessageSend.Model.WaModel;

public interface IDatabase
{
    public void addNumbber(WaModel waModel);

    public void sendText(WaModel waModel);

    public void sendImage(WaModel waModel);

    public void sendDocument(WaModel waModel);

    public void sendAudio(WaModel waModel);

    public void sendVideo(WaModel waModel);

    public void sendLink(WaModel waModel);

    public void sendLocation(WaModel waModel);

}
