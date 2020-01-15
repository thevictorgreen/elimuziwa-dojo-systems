//Dojo.java
package io.vdigital;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import java.util.*;

public class Dojo {

  public Dojo() {

    Console c = System.console();
    if (c == null) {
      System.out.println("console not available");
      System.exit(1);
    }

    System.out.println("");
    System.out.println("RHCSA EXAM Prep");
    System.out.println("");
    System.out.println("Select your dojo");

    String dojo = "";

    System.out.println("1) Metaskills");
    System.out.println("2) Exam Prep");
    System.out.println("3) Knowledge Base");
    System.out.println("");

    boolean dojoSelected = false;

    while(!dojoSelected) {
      dojo = c.readLine("Enter dojo number:");
      if (dojo.equals("1")) {
        dojoSelected = true;
      }
      else
      if (dojo.equals("2")) {
        dojoSelected = true;
      }
      else
      if (dojo.equals("3")) {
        dojoSelected = true;
      }
      else {
        System.out.println("not available try again");
      }
    }


    if (dojo.equals("1")) {
      System.out.println("");
      System.out.println("Select your module");
      String module = "";
      String mode = "";

      System.out.println("1) Command Line FU");
      System.out.println("2) Bash Scripting");
      System.out.println("3) Python Scripting");
      System.out.println("4) Go Scripting");
      System.out.println("5) File Folder Management");
      System.out.println("6) Text Processing");
      System.out.println("7) Software Management");
      System.out.println("8) System Boot Management");
      System.out.println("9) Kernel Management");
      System.out.println("10 Job and Process Management");
      System.out.println("11 Awk");
      System.out.println("12 Find");
      System.out.println("13 Grep");
      System.out.println("14 Iostat");
      System.out.println("15 Lsof");
      System.out.println("16 Netstat");
      System.out.println("17 Ps");
      System.out.println("18 Sed");
      System.out.println("19 Ss");
      System.out.println("20 Strace");
      System.out.println("21 Tcpdump");
      System.out.println("22 Top");
      System.out.println("23 Vim");
      System.out.println("24 Vmstat");
      System.out.println("25 Journalctl");
      System.out.println("");

      boolean complete = false;
      while(!complete) {
        module = c.readLine("Select module number:");

        if (module.equals("1")) {
          module = "json/rhcsa/metaskills/01-command-line-fu.json";
          complete = true;
        }
        else
        if (module.equals("2")) {
          module = "json/rhcsa/metaskills/02-bash-scripting.json";
          complete = true;
        }
        else
        if (module.equals("3")) {
          module = "json/rhcsa/metaskills/03-python-scripting.json";
          complete = true;
        }
        else
        if (module.equals("4")) {
          module = "json/rhcsa/metaskills/04-go-scripting.json";
          complete = true;
        }
        else
        if (module.equals("5")) {
          module = "json/rhcsa/metaskills/05-file-folder-management.json";
          complete = true;
        }
        else
        if (module.equals("6")) {
          module = "json/rhcsa/metaskills/06-text-processing.json";
          complete = true;
        }
        else
        if (module.equals("7")) {
          module = "json/rhcsa/metaskills/07-software-mgt.json";
          complete = true;
        }
        else
        if (module.equals("8")) {
          module = "json/rhcsa/metaskills/08-linux-boot-mgt.json";
          complete = true;
        }
        else
        if (module.equals("9")) {
          module = "json/rhcsa/metaskills/09-kernel-mgt.json";
          complete = true;
        }
        else
        if (module.equals("10")) {
          module = "json/rhcsa/metaskills/10-jobs-procs-mgt.json";
          complete = true;
        }
        else
        if (module.equals("11")) {
          module = "json/rhcsa/metaskills/11-awk.json";
          complete = true;
        }
        else
        if (module.equals("12")) {
          module = "json/rhcsa/metaskills/12-find.json";
          complete = true;
        }
        else
        if (module.equals("13")) {
          module = "json/rhcsa/metaskills/13-grep.json";
          complete = true;
        }
        else
        if (module.equals("14")) {
          module = "json/rhcsa/metaskills/14-iostat.json";
          complete = true;
        }
        else
        if (module.equals("15")) {
          module = "json/rhcsa/metaskills/15-lsof.json";
          complete = true;
        }
        else
        if (module.equals("16")) {
          module = "json/rhcsa/metaskills/16-netstat.json";
          complete = true;
        }
        else
        if (module.equals("17")) {
          module = "json/rhcsa/metaskills/17-ps.json";
          complete = true;
        }
        else
        if (module.equals("18")) {
          module = "json/rhcsa/metaskills/18-sed.json";
          complete = true;
        }
        else
        if (module.equals("19")) {
          module = "json/rhcsa/metaskills/19-ss.json";
          complete = true;
        }
        else
        if (module.equals("20")) {
          module = "json/rhcsa/metaskills/20-strace.json";
          complete = true;
        }
        else
        if (module.equals("21")) {
          module = "json/rhcsa/metaskills/21-tcpdump.json";
          complete = true;
        }
        else
        if (module.equals("22")) {
          module = "json/rhcsa/metaskills/22-top.json";
          complete = true;
        }
        else
        if (module.equals("23")) {
          module = "json/rhcsa/metaskills/23-vim.json";
          complete = true;
        }
        else
        if (module.equals("24")) {
          module = "json/rhcsa/metaskills/24-vmstat.json";
          complete = true;
        }
        else
        if (module.equals("25")) {
          module = "json/rhcsa/metaskills/25-journalctl.json";
          complete = true;
        }
        else {
          System.out.println("not available try again");
        }
      }

      boolean modeSelected = false;

      while(!modeSelected) {
        System.out.println("");
        System.out.println("1) White Belt (Step by commands with explanations)");
        System.out.println("2) Purple Belt (Decide whether or not to show the steps. Enter show on selected task.)");
        System.out.println("3) Red Belt (You are on your own!)");
        System.out.println("");
        mode = c.readLine("Select mode number:");

        if (mode.equals("1")) {
          break;
        }
        else
        if (mode.equals("2")) {
          break;
        }
        else
        if (mode.equals("3")) {
          break;
        }
        else {
          System.out.println("not available try again");
        }
      }

      JSONParser parser = new JSONParser();
      try {


        Object obj = parser.parse(new FileReader( module ));

        JSONObject jsonObject = (JSONObject) obj;

        String module_name = (String) jsonObject.get("module_name");
        System.out.println("");
        System.out.println("");
        System.out.println(module_name);

        JSONArray tasks = (JSONArray) jsonObject.get("tasks");
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {

          Object obj1 = iterator.next();
          JSONObject task = (JSONObject) obj1;
          String taskText = (String) task.get("task");
          //System.out.println("");
          System.out.println("");
          //System.out.println("[task] " + taskText + " [begin]");
          String show = c.readLine("[task] " + taskText + " [begin]: ");
          System.out.println("");
          //String show = c.readLine("");

          if (mode.equals("1")) {
            JSONArray steps = (JSONArray) task.get("steps");
            Iterator<String> iterator2 = steps.iterator();
            while (iterator2.hasNext()) {
              Object obj2 = iterator2.next();
              JSONObject step = (JSONObject) obj2;
              String stepText = (String) step.get("cmd");
              String explText = (String) step.get("why");
              System.out.println("[cmd] - "+ stepText);
              System.out.println("[why] - "+ explText);
              c.readLine();
            }
          }

          if (mode.equals("2")) {
            if (show.equals("show")) {
              JSONArray steps = (JSONArray) task.get("steps");
              Iterator<String> iterator2 = steps.iterator();
              while (iterator2.hasNext()) {
                Object obj2 = iterator2.next();
                JSONObject step = (JSONObject) obj2;
                String stepText = (String) step.get("cmd");
                String explText = (String) step.get("why");
                System.out.println("[cmd] - "+ stepText);
                System.out.println("[why] - "+ explText);
                c.readLine();
              }
            }
          }


          //System.out.println("[task] " + taskText + " [end]");
          System.out.println("[complete]-----------------------------------------------------------------");
          c.readLine();

        }

        System.out.println(module_name + " [complete]");
      } catch (Exception e) {
        e.printStackTrace();
      }

    }


    else
    if (dojo.equals("2")) {
      System.out.println("");
      System.out.println("Select your module");
      String module = "";
      String mode = "";

      System.out.println("1) Initial Setup");
      System.out.println("2) Storage Administration");
      System.out.println("3) User Administration");
      System.out.println("4) Security Hardening");
      System.out.println("");

      boolean complete = false;
      while(!complete) {
        module = c.readLine("Select module number:");

        if (module.equals("1")) {
          module = "json/rhcsa/examprep/01-practice-initial-setup.json";
          complete = true;
        }
        else
        if (module.equals("2")) {
          module = "json/rhcsa/examprep/02-practice-storage-admin.json";
          complete = true;
        }
        else
        if (module.equals("3")) {
          module = "json/rhcsa/examprep/03-practice-user-admin.json";
          complete = true;
        }
        else
        if (module.equals("4")) {
          module = "json/rhcsa/examprep/04-practice-security-hardening.json";
          complete = true;
        }
        else {
          System.out.println("not available try again");
        }
      }

      boolean modeSelected = false;

      while(!modeSelected) {
        System.out.println("");
        System.out.println("1) White Belt (Step by commands with explanations)");
        System.out.println("2) Purple Belt (Decide whether or not to show the steps. Enter show on selected task.)");
        System.out.println("3) Red Belt (You are on your own!)");
        System.out.println("");
        mode = c.readLine("Select mode number:");

        if (mode.equals("1")) {
          break;
        }
        else
        if (mode.equals("2")) {
          break;
        }
        else
        if (mode.equals("3")) {
          break;
        }
        else {
          System.out.println("not available try again");
        }
      }

      JSONParser parser = new JSONParser();
      try {


        Object obj = parser.parse(new FileReader( module ));

        JSONObject jsonObject = (JSONObject) obj;

        String module_name = (String) jsonObject.get("module_name");
        System.out.println("");
        System.out.println("");
        System.out.println(module_name);

        JSONArray tasks = (JSONArray) jsonObject.get("tasks");
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {

          Object obj1 = iterator.next();
          JSONObject task = (JSONObject) obj1;
          String taskText = (String) task.get("task");
          //System.out.println("");
          System.out.println("");
          //System.out.println("[task] " + taskText + " [begin]");
          String show = c.readLine("[task] " + taskText + " [begin]: ");
          System.out.println("");
          //String show = c.readLine("");

          if (mode.equals("1")) {
            JSONArray steps = (JSONArray) task.get("steps");
            Iterator<String> iterator2 = steps.iterator();
            while (iterator2.hasNext()) {
              Object obj2 = iterator2.next();
              JSONObject step = (JSONObject) obj2;
              String stepText = (String) step.get("cmd");
              String explText = (String) step.get("why");
              System.out.println("[cmd] - "+ stepText);
              System.out.println("[why] - "+ explText);
              c.readLine();
            }
          }

          if (mode.equals("2")) {
            if (show.equals("show")) {
              JSONArray steps = (JSONArray) task.get("steps");
              Iterator<String> iterator2 = steps.iterator();
              while (iterator2.hasNext()) {
                Object obj2 = iterator2.next();
                JSONObject step = (JSONObject) obj2;
                String stepText = (String) step.get("cmd");
                String explText = (String) step.get("why");
                System.out.println("[cmd] - "+ stepText);
                System.out.println("[why] - "+ explText);
                c.readLine();
              }
            }
          }


          //System.out.println("[task] " + taskText + " [end]");
          System.out.println("[complete]-----------------------------------------------------------------");
          c.readLine();

        }

        System.out.println(module_name + " [complete]");
      } catch (Exception e) {
        e.printStackTrace();
      }

    }


    else
    if (dojo.equals("3")) {
      System.out.println("");
      System.out.println("Select your module");
      String module = "";
      String mode = "";

      System.out.println("1)  Installing RHEL Server");
      System.out.println("2)  Using Essential Tools");
      System.out.println("3)  Essential File Management");
      System.out.println("4)  Working With Text Files");
      System.out.println("5)  Connecting To A RHEL Server");
      System.out.println("6)  Managing Users And Groups");
      System.out.println("7)  Managing Permissions");
      System.out.println("8)  Configuring Networking");
      System.out.println("9)  Managing Processes");
      System.out.println("10) Managing Software");
      System.out.println("11) Working With Virtual Machines");
      System.out.println("12) Scheduling Tasks");
      System.out.println("13) Configuring Logging");
      System.out.println("14) Managing Partitions");
      System.out.println("15) Managing Logical Volumes");
      System.out.println("16) Managing The Kernel");
      System.out.println("17) Managing And Understanding The Boot Procedure");
      System.out.println("18) Applying Essential Troubleshooting Skills");
      System.out.println("19) Managing HTTP Services");
      System.out.println("20) Connecting To An LDAP Server");
      System.out.println("21) Accessing Remote File Systems And Automount");
      System.out.println("22) Managing Selinux");
      System.out.println("23) Configuring A Firewall");
      System.out.println("24) Using Kickstart");
      System.out.println("25) Configuring Time Services");
      System.out.println("26) Managing SSH");
      System.out.println("");
//here to
      boolean complete = false;
      while(!complete) {
        module = c.readLine("Select module number:");

        if (module.equals("1")) {
          module = "json/rhcsa/knowledgebase/01-installing-rhel-server.json";
          complete = true;
        }
        else
        if (module.equals("2")) {
          module = "json/rhcsa/knowledgebase/02-using-essential-tools.json";
          complete = true;
        }
        else
        if (module.equals("3")) {
          module = "json/rhcsa/knowledgebase/03-essential-file-management-tools.json";
          complete = true;
        }
        else
        if (module.equals("4")) {
          module = "json/rhcsa/knowledgebase/04-working-with-text-files.json";
          complete = true;
        }
        else
        if (module.equals("5")) {
          module = "json/rhcsa/knowledgebase/05-connecting-to-a-rhel-server.json";
          complete = true;
        }
        else
        if (module.equals("6")) {
          module = "json/rhcsa/knowledgebase/06-managing-users-and-groups.json";
          complete = true;
        }
        else
        if (module.equals("7")) {
          module = "json/rhcsa/knowledgebase/07-managing-permissions.json";
          complete = true;
        }
        else
        if (module.equals("8")) {
          module = "json/rhcsa/knowledgebase/08-configuring-networking.json";
          complete = true;
        }
        else
        if (module.equals("9")) {
          module = "json/rhcsa/knowledgebase/09-managing-processes.json";
          complete = true;
        }
        else
        if (module.equals("10")) {
          module = "json/rhcsa/knowledgebase/10-managing-software.json";
          complete = true;
        }
        else
        if (module.equals("11")) {
          module = "json/rhcsa/knowledgebase/11-working-with-virutal-machines.json";
          complete = true;
        }
        else
        if (module.equals("12")) {
          module = "json/rhcsa/knowledgebase/12-scheduling-tasks.json";
          complete = true;
        }
        else
        if (module.equals("13")) {
          module = "json/rhcsa/knowledgebase/13-configuring-logging.json";
          complete = true;
        }
        else
        if (module.equals("14")) {
          module = "json/rhcsa/knowledgebase/14-managing-partitions.json";
          complete = true;
        }
        else
        if (module.equals("15")) {
          module = "json/rhcsa/knowledgebase/15-managing-logical-volumes.json";
          complete = true;
        }
        else
        if (module.equals("16")) {
          module = "json/rhcsa/knowledgebase/16-managing-the-kernel.json";
          complete = true;
        }
        else
        if (module.equals("17")) {
          module = "json/rhcsa/knowledgebase/17-managing-and-understanding-the-boot-procedure.json";
          complete = true;
        }
        else
        if (module.equals("18")) {
          module = "json/rhcsa/knowledgebase/18-applying-essential-troubleshooting-skills.json";
          complete = true;
        }
        else
        if (module.equals("19")) {
          module = "json/rhcsa/knowledgebase/19-managing-http-services.json";
          complete = true;
        }
        else
        if (module.equals("20")) {
          module = "json/rhcsa/knowledgebase/20-connecting-to-an-ldap-server.json";
          complete = true;
        }
        else
        if (module.equals("21")) {
          module = "json/rhcsa/knowledgebase/21-accessing-remote-file-systems-and-automount.json";
          complete = true;
        }
        else
        if (module.equals("22")) {
          module = "json/rhcsa/knowledgebase/22-managing-selinux.json";
          complete = true;
        }
        else
        if (module.equals("23")) {
          module = "json/rhcsa/knowledgebase/23-configuring-a-firewall.json";
          complete = true;
        }
        else
        if (module.equals("24")) {
          module = "json/rhcsa/knowledgebase/24-using-kickstart.json";
          complete = true;
        }
        else
        if (module.equals("25")) {
          module = "json/rhcsa/knowledgebase/25-configuring-time-services.json";
          complete = true;
        }
        else
        if (module.equals("26")) {
          module = "json/rhcsa/knowledgebase/26-managing-ssh.json";
          complete = true;
        }
        else {
          System.out.println("not available try again");
        }
      }

      boolean modeSelected = false;

      while(!modeSelected) {
        System.out.println("");
        System.out.println("1) White Belt (Step by commands with explanations)");
        System.out.println("2) Purple Belt (Decide whether or not to show the steps. Enter show on selected task.)");
        System.out.println("3) Red Belt (You are on your own!)");
        System.out.println("");
        mode = c.readLine("Select mode number:");

        if (mode.equals("1")) {
          break;
        }
        else
        if (mode.equals("2")) {
          break;
        }
        else
        if (mode.equals("3")) {
          break;
        }
        else {
          System.out.println("not available try again");
        }
      }

      JSONParser parser = new JSONParser();
      try {


        Object obj = parser.parse(new FileReader( module ));

        JSONObject jsonObject = (JSONObject) obj;

        String module_name = (String) jsonObject.get("module_name");
        System.out.println("");
        System.out.println("");
        System.out.println(module_name);

        JSONArray tasks = (JSONArray) jsonObject.get("tasks");
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {

          Object obj1 = iterator.next();
          JSONObject task = (JSONObject) obj1;
          String taskText = (String) task.get("task");
          //System.out.println("");
          System.out.println("");
          //System.out.println("[task] " + taskText + " [begin]");
          String show = c.readLine("[task] " + taskText + " [begin]: ");
          System.out.println("");
          //String show = c.readLine("");

          if (mode.equals("1")) {
            JSONArray steps = (JSONArray) task.get("steps");
            Iterator<String> iterator2 = steps.iterator();
            while (iterator2.hasNext()) {
              Object obj2 = iterator2.next();
              JSONObject step = (JSONObject) obj2;
              String stepText = (String) step.get("cmd");
              String explText = (String) step.get("why");
              System.out.println("[cmd] - "+ stepText);
              System.out.println("[why] - "+ explText);
              c.readLine();
            }
          }

          if (mode.equals("2")) {
            if (show.equals("show")) {
              JSONArray steps = (JSONArray) task.get("steps");
              Iterator<String> iterator2 = steps.iterator();
              while (iterator2.hasNext()) {
                Object obj2 = iterator2.next();
                JSONObject step = (JSONObject) obj2;
                String stepText = (String) step.get("cmd");
                String explText = (String) step.get("why");
                System.out.println("[cmd] - "+ stepText);
                System.out.println("[why] - "+ explText);
                c.readLine();
              }
            }
          }


          //System.out.println("[task] " + taskText + " [end]");
          System.out.println("[complete]-----------------------------------------------------------------");
          c.readLine();

        }

        System.out.println(module_name + " [complete]");
      } catch (Exception e) {
        e.printStackTrace();
      }
//here

    }


  }

  public static void main(String[] args) {
    new Dojo();
  }


}
