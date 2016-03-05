package src;

import java.io.*;
import java.util.HashMap;

/**
 * @author Cheenar
 * @description Settings save and loaded
 */

public class Settings
{

    private HashMap<String, String> settings = new HashMap<String, String>();
    private final String settingsFileName = "settings.cfg";
    private File settingsFile;

    public Settings()
    {
        readSettingsFile();
    }

    public HashMap<String, String> getSettings()
    {
        return this.settings;
    }

    public String getSetting(String key)
    {
        return getSettings().get(key);
    }

    public Integer getSettingInt(String key)
    {
        return Integer.parseInt(getSetting(key));
    }

    private void initDefaultSettings()
    {
        getSettings().put("player1", "mouse");
        getSettings().put("player2", "cpu_easy");
        getSettings().put("windowX", "640");
        getSettings().put("windowY", "480");
    }

    private void initSettingsFile()
    {
        try
        {
            settingsFile = new File(settingsFileName);
            if(!settingsFile.exists())
            {
                settingsFile.createNewFile();
                initDefaultSettings();
                saveSettingsFile();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private void readSettingsFile()
    {
        try
        {
            initSettingsFile();
            BufferedReader in = new BufferedReader(new FileReader(settingsFile));
            String line = "";
            while((line = in.readLine()) != null)
            {
                String[] args = line.split(":");
                getSettings().put(args[0], args[1]);
            }
            in.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void saveSettingsFile()
    {
        try
        {
            initSettingsFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(settingsFile));
            for(String key : getSettings().keySet())
            {
                out.write(key + ":" + getSettings().get(key) + "\n");
            }
            out.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
