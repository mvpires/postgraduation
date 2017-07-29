//
//  ViewController.m
//  InterfaceProject
//
//  Created by Treinamento on 29/07/17.
//  Copyright © 2017 Treinamento. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    self.button.hidden = YES;
    self.value = 0;
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)switch:(id)sender {
    if(self.button.hidden)
    {
        self.button.hidden = NO;
    }
    else{
        self.button.hidden = YES;
    }
}
- (IBAction)changeSliderValue:(UISlider *)sender {
    
    self.value++;
    
    self.sliderValue.text = [NSString stringWithFormat:@"%f", sender.value];

}


@end
