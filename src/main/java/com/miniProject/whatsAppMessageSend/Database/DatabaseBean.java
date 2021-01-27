package com.miniProject.whatsAppMessageSend.Database;

import com.miniProject.whatsAppMessageSend.Model.WaModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * "parts": [
 *       {
 *         "id": "1",
 *         "contentType": "text/plain",
 *         "data": "​ MESSAGE_BODY​ ",
 *         "size": MESSAGE_BODY_SIZE​,
 *         "type": "body",
 *         "sort": 0
 *       },
 *       {
 *         "id": "0",
 *         "contentType": "​ CONTENT_TYPE​ ",
 *         "size": ​IMAGE_LINK_SIZE​,
 *         "type": "image_link",
 *         "name": "​ FILE_NAME​ ",
 *         "data": "​ IMAGE_LINK​ ",
 *         "sort": 1
 *       }
 *     ]
 */
public class DatabaseBean implements  IDatabase
{
    JdbcTemplate addNumberJdbcTemplate;
    JdbcTemplate sendJdbcTemplateId0;
    JdbcTemplate sendJdbcTemplateId1;

    private static final Logger log = LoggerFactory.getLogger(DatabaseBean.class);

    public DatabaseBean( DataSource  waAddNumber, DataSource waSendData)
    {
        super();
        addNumberJdbcTemplate = new JdbcTemplate(waAddNumber);
        sendJdbcTemplateId1 = new JdbcTemplate(waSendData);

        initJdbcTemplate(waAddNumber, waSendData);
    }

    private void initJdbcTemplate( JdbcTemplate addNumberJdbcTemplate, JdbcTemplate sendJdbcTemplateId1)
    {
        addNumberJdbcTemplate.setExceptionTranslator((task, sql, exception) ->
        {

            log.error("can't to execute query {}, error message {}", sql, exception.getMessage());
            return super(sql, exception);
        });
    }

    @Override
    public void addNumbber( WaModel waModel )
    {

    }

    @Override
    public void sendText( WaModel waModel )
    {

    }

    @Override
    public void sendImage( WaModel waModel )
    {

    }

    @Override
    public void sendDocument( WaModel waModel )
    {

    }

    @Override
    public void sendAudio( WaModel waModel )
    {

    }

    @Override
    public void sendVideo( WaModel waModel )
    {

    }

    @Override
    public void sendLink( WaModel waModel )
    {

    }

    @Override
    public void sendLocation( WaModel waModel )
    {

    }
}
