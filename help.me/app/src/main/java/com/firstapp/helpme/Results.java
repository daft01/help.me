package com.firstapp.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        TextView title = (TextView) findViewById(R.id.title);
        TextView help = (TextView) findViewById(R.id.help);
        Intent intent = getIntent();
        int num = intent.getIntExtra("num", 0);
        String str = "Here is Some Information While the Help Arrives";

        if(num == 1) {
            title.setText(str);
            help.setText("If you have not been ordered to evacuate, stay in a safe area or shelter during a natural disaster. In your home, a safe area may be a ground floor interior room, closet or bathroom. Be sure you have access to your survival kit in case you are in an emergency event that lasts several days.\n Listen to your portable radio for important updates and instructions from local authorities. Remember to have a battery-powered radio in your survival kit. Some radios are now equipped with multiple power sources, such as batteries, solar panels and a hand crank\n If power is lost, use a generator with caution. Make sure conditions are safe before operating a portable generator. Only operate it outside — away from windows, doors or vents. Follow all manufacturer’s instructions.\n Stay in your safe area and do not drive until the danger has passed. Resist the temptation to check on your property until you are sure it is safe to do so.");
        }
        else if(num ==2){
            title.setText(str);
            help.setText("If you have not been ordered to evacuate, stay in a safe area or shelter during a natural disaster. In your home, a safe area may be a ground floor interior room, closet or bathroom. Be sure you have access to your survival kit in case you are in an emergency event that lasts several days.\n Listen to your portable radio for important updates and instructions from local authorities. Remember to have a battery-powered radio in your survival kit. Some radios are now equipped with multiple power sources, such as batteries, solar panels and a hand crank\n If power is lost, use a generator with caution. Make sure conditions are safe before operating a portable generator. Only operate it outside — away from windows, doors or vents. Follow all manufacturer’s instructions.\n Stay in your safe area and do not drive until the danger has passed. Resist the temptation to check on your property until you are sure it is safe to do so.");
        }
        else if(num ==3){
            title.setText(str);
            help.setText("If you have not been ordered to evacuate, stay in a safe area or shelter during a natural disaster. In your home, a safe area may be a ground floor interior room, closet or bathroom. Be sure you have access to your survival kit in case you are in an emergency event that lasts several days.\n Listen to your portable radio for important updates and instructions from local authorities. Remember to have a battery-powered radio in your survival kit. Some radios are now equipped with multiple power sources, such as batteries, solar panels and a hand crank\n If power is lost, use a generator with caution. Make sure conditions are safe before operating a portable generator. Only operate it outside — away from windows, doors or vents. Follow all manufacturer’s instructions.\n Stay in your safe area and do not drive until the danger has passed. Resist the temptation to check on your property until you are sure it is safe to do so.");
        }
        else if(num ==4){
            title.setText(str);
            help.setText("If you have not been ordered to evacuate, stay in a safe area or shelter during a natural disaster. In your home, a safe area may be a ground floor interior room, closet or bathroom. Be sure you have access to your survival kit in case you are in an emergency event that lasts several days.\n Listen to your portable radio for important updates and instructions from local authorities. Remember to have a battery-powered radio in your survival kit. Some radios are now equipped with multiple power sources, such as batteries, solar panels and a hand crank\n If power is lost, use a generator with caution. Make sure conditions are safe before operating a portable generator. Only operate it outside — away from windows, doors or vents. Follow all manufacturer’s instructions.\n Stay in your safe area and do not drive until the danger has passed. Resist the temptation to check on your property until you are sure it is safe to do so.");
        }
        else if(num ==5){
            title.setText(str);
            help.setText("If you have not been ordered to evacuate, stay in a safe area or shelter during a natural disaster. In your home, a safe area may be a ground floor interior room, closet or bathroom. Be sure you have access to your survival kit in case you are in an emergency event that lasts several days.\n Listen to your portable radio for important updates and instructions from local authorities. Remember to have a battery-powered radio in your survival kit. Some radios are now equipped with multiple power sources, such as batteries, solar panels and a hand crank\n If power is lost, use a generator with caution. Make sure conditions are safe before operating a portable generator. Only operate it outside — away from windows, doors or vents. Follow all manufacturer’s instructions.\n Stay in your safe area and do not drive until the danger has passed. Resist the temptation to check on your property until you are sure it is safe to do so.");
        }
        else if(num ==6){
            title.setText(str);
            help.setText("If you have not been ordered to evacuate, stay in a safe area or shelter during a natural disaster. In your home, a safe area may be a ground floor interior room, closet or bathroom. Be sure you have access to your survival kit in case you are in an emergency event that lasts several days.\n Listen to your portable radio for important updates and instructions from local authorities. Remember to have a battery-powered radio in your survival kit. Some radios are now equipped with multiple power sources, such as batteries, solar panels and a hand crank\n If power is lost, use a generator with caution. Make sure conditions are safe before operating a portable generator. Only operate it outside — away from windows, doors or vents. Follow all manufacturer’s instructions.\n Stay in your safe area and do not drive until the danger has passed. Resist the temptation to check on your property until you are sure it is safe to do so.");
        }
        else if(num ==7){
            title.setText("Fractures");
            help.setText("If you suspect that someone has a broken bone, provide first-aid treatment and help them get professional care: Stop any bleeding:\nIf they’re bleeding, elevate and apply pressure to the wound using a sterile bandage, a clean cloth, or a clean piece of clothing\nImmobilize the injured area:If you suspect they’ve broken a bone in their neck or back, help them stay as still as possible\nIf you suspect they’ve broken a bone in one of their limbs, immobilize the area using a splint or sling.Apply cold to the area:\nWrap an ice pack or bag of ice cubes in a piece of cloth and apply it to the injured area for up to 10 minutes at a time. Treat them for shock:\nHelp them get into a comfortable position, encourage them to rest, and reassure them. Cover them with a blanket or clothing to keep them warm.Get professional help:\nCall 911 or help them get to the emergency department for professional care.");
        }
        else if(num ==8){
            title.setText("Cuts");
            help.setText("Wash your hands with soap or antibacterial cleanser to prevent infection.\\n\n" +
                    "\\nThen, wash the cut thoroughly with mild soap and water.\n" +
                    "\\nUse direct pressure to stop the bleeding.\n" +
                    "\\nApply antibacterial ointment and a clean bandage that will not stick to the wound.\\nFOR MINOR PUNCTURES\n" +
                    "Wash your hands with soap or antibacterial cleanser to prevent infection.\n" +
                    "Rinse the puncture for 5 minutes under running water. Then wash with soap.\n" +
                    "Look (but do not poke around) for objects inside the wound. If found, don't remove it. Go to your emergency or urgent care center.\n" +
                    "If you can't see anything inside the wound, but a piece of the object that caused the injury is missing, also seek medical attention.\n" +
                    "Apply antibacterial ointment and a clean bandage that will not stick to the wound.\n" +
                    "Scarring is a potential complication of any wound. Prompt first aid and the prevention of infection reduce the risk of scarring");
        }
        else if(num ==9){
            title.setText("Buns");
            help.setText("Heat burns (thermal burns): Smother any flames by covering them with a blanket or water. If your clothing catches fire, do not run: stop, drop, and roll on the ground to smother the flames.\n" +
                    "Cold temperature burns: Try first aid measures to warm the areas. Small areas of your body (ears, face, nose, fingers, toes) that are really cold or frozen can be warmed by blowing warm air on them, tucking them inside your clothing or putting them in warm water.\n" +
                    "Liquid scald burns (thermal burns): Run cool tap water over the burn for 10 to 20 minutes. Do not use ice.\n" +
                    "Electrical burns: After the person has been separated from the electrical source, check for breathing and a heartbeat. If the person is not breathing or does not have a heartbeat, call .");
        }
        else if(num ==10){
            title.setText("Loss of Consioncess");
            help.setText("");
        }
        else if(num ==11){
            title.setText("CPR");
            help.setText("1. Push hard, push fast. Place your hands, one on top of the other, in the middle of the chest. Use your body weight to help you administer compressions that are at least 2 inches deep and delivered at a rate of at least 100 compressions per minute.\\n\\n2.Deliver rescue breaths. With the person\\'s head tilted back slightly and the chin lifted, pinch the nose shut and place your mouth over the person\\'s mouth to make a complete seal. Blow into the person\\'s mouth to make the chest rise. Deliver two rescue breaths, then continue compressions.Note: If the chest does not rise with the initial rescue breath, re-tilt the head before delivering the second breath. If the chest doesn\\'t rise with the second breath, the person may be choking. After each subsequent set of 100 chest compressions, and before attempting breaths, look for an object and, if seen, remove it.\\n\n" +
                    "\\n3. Continue CPR steps. Keep performing cycles of chest compressions and breathing until the person exhibits signs of life, such as breathing, an AED becomes available, or EMS or a trained medical responder arrives on scene.\n" +
                    "Note: End the cycles if the scene becomes unsafe or you cannot continue performing CPR due to exhaustion.");
        }
        else if(num ==12){
            title.setText("Stroke");
            help.setText("If the person is conscious, lay them down on their side with their head slightly raised and supported.\n" +
                    "Do not give them anything to eat or drink.  Loosen any restrictive clothing that could cause breathing difficulties. If weakness is obvious in any limb, support it and avoid pulling on it when moving the person.\n" +
                    "If they are unconscious, check their breathing and pulse and put them on their side. If they do not have a pulse or are not breathing start CPR straight away.\n" +
                    "If you are unsure how to perform CPR the ambulance call taker will give instructions over the phone.");
        }
        else if(num ==13){
            title.setText("Pycholigical Crisis");
            help.setText("If you have developed a plan to kill yourself, that's an immediate mental health crisis and you should go to a hospital emergency room or call 911.\n" +
                    "\n" +
                    "If you're not sure if it's urgent, ask yourself if you have already thought about what method you would use. If you've thought about where, how or when you would take your life, that means you've begun developing a plan.\n" +
                    "\n" +
                    "If you're still hesitating, ask a friend or family member to stay with you while you may be at risk. Call the National Suicide Prevention Hotline at 1-800-273-8255 as soon as possible. They have trained counselors available to speak with you 24/7 and assist in a crisis situation.");
        }
        else if(num ==14){
            title.setText("Poisoning");
            help.setText("Remove anything remaining in the person's mouth. If the suspected poison is a household cleaner or other chemical, read the container's label and follow instructions for accidental poisoning.\n" +
                    "Poison on the skin:  Remove any contaminated clothing using gloves. Rinse the skin for 15 to 20 minutes in a shower or with a hose.\n" +
                    "Poison in the eye. Gently flush the eye with cool or lukewarm water for 20 minutes or until help arrives.\n" +
                    "Inhaled poison:  Get the person into fresh air as soon as possible.\n" +
                    "If the person vomits, turn his or her head to the side to prevent choking.\n" +
                    "Begin CPR if the person shows no signs of life, such as moving, breathing or coughing.\n" +
                    "\n" +
                    "\n" +
                    "[11:15] \n" +
                    "Seizure\n" +
                    "1. Prevent Choking\n" +
                    "Loosen clothing around the person's neck.\n" +
                    "Roll the person on his or her side to keep the airway open.\n" +
                    "Don't put anything into the person's mouth.\n" +
                    "2. Protect From Injury\n" +
                    "Move sharp objects, such as glassware or furniture, away from the person.");
        }
        else if(num ==15){
            title.setText("Hazardons Fluit Into Eyes");
            help.setText("");
        }
        else if(num ==16){
            title.setText("Seizures");
            help.setText("1. Prevent Choking\n" +
                    "Loosen clothing around the person's neck.\n" +
                    "Roll the person on his or her side to keep the airway open.\n" +
                    "Don't put anything into the person's mouth.\n" +
                    "2. Protect From Injury\n" +
                    "Move sharp objects, such as glassware or furniture, away from the person.");
        }

    }



}
