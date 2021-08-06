# Android Counter App Tutorial


## Create a new app

1. After launching Intellj, make a new project by File -> New -> Project
2. Select an Android application on the left pannel
3. In the SDK setup, all required components will be preselected, click Next
4. After the download is finished, select Empty Activity in the project template
5. Choose a project name, make sure to select Java as the language
![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/app_configue.png)

## Project Structure
Select display structure as Android app
![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/structure.png)

For each screen of the app, there are 2 files that structure the view:
- An XML file that contains the layout of the screen. The file is located under app > res > layout
- A Java class that control the functionality of the screen. The file is located under src file

**Edit the UI layout**
Open the activity_main.xml file under main/res/layout. You can choose to drag and drop components in the design tab or you can view the xml code. 

Add a Textview to display the counter and 2 buttons for increment and decrement the counter
![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/design_view.png)

For each component, you need to give it an id  which will be used to identify the component in the Java class
![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/id.png)

Edit the text field for the button to display "+" and "-"

Feel free to play around with the contrains and declared attribute to make the layout looks nicer (https://abhiandroid.com/ui/constraintlayout)

**Make the Screen Interactive**
Open the MainActivity.java class
- We have a different type of UI controls available in android to implement the user interface for our android applications. In this project, we use the TextView and Button user interface control. We need to declare the variables that are bind to the components declare in the UI. Make sure to import TextView and Button type
```sh
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    //declare all variables used in the class
    private int counter;
    private TextView counterDisplay;
    private Button incrementButton, decrementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
```

- We need to bind the variables to the corresponding component using its id
```sh
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //biding view components
        counterDisplay = findViewById(R.id.counter);
        incrementButton = findViewById(R.id.add_button);
```

- Set the counter display to start at 0 when the app is created
```sh
        counterDisplay.setText("0");
```

- To add functionality to the buttons, we need an Event handler. Create an View.OnClickListener object and assign it to the button by calling setOnClickListener(View.OnClickListener). The editor will automatically ask you to handle the onClick event for the button. 

```sh
        incrementButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });
```

- In order to increment the counter, we need to get the counter's current value, increment it by 1, and update the coutner with the new value
```sh
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = Integer.parseInt(counterDisplay.getText().toString());
                counter += 1;
                counterDisplay.setText(Integer.toString(counter));
            }
        });
```
## Build and run the application
Using the device similator, we can pick any android devices to deploy and run the app. 
**Configure Android virtual device**
1. In the main IntelliJ IDEA toolbar, click the devices list and choose AVD Manager
![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/adv_set_1.png)
3. Click on Create Virtual Device > Phone > Pixel 3 > Next
4. Choose an OS version for the device and download
5. Once finished, you can see the device is being selected for the project
![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/adv_setup_2.png)

**Build and Deploy the App**
 Selected and click the Run button
 The Android emulator will launch after the build has successfully finished, with our application started
 ![alt text](https://github.com/nickinhinguyen/Counter-App/blob/master/img/phone.png)
## Exercise
Implement the functionality for the decrement button

## Conclusion 
Congratulations! You have successfully built an Android app!
However, the code structure we used today does not follow Clean Architecture at all.We will learn more about the Clean Architecture in class and apply the concept to make our code more scalable. 
