//
//  ViewController.m
//  FirstProject
//
//  Created by Treinamento on 29/07/17.
//  Copyright © 2017 Treinamento. All rights reserved.
//

#import "ViewController.h"
#import "SecondController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)changeLabel:(id)sender {
    self.MyLabel.text = @"Teste";
}
- (IBAction)changeSecondLabel:(id)sender {
    //self.SecondLabel.text = self.MyLabel.text;
    [self changeString:@"texto"];
}

- (void)changeString: (NSString *)texto{
    NSString *novaString = [NSString stringWithFormat: @"O nome é %@",
                            texto];
    self.SecondLabel.text = novaString;
    
    [self changeString:texto withString:@" aula"];
}

- (void)changeString: (NSString *)texto1 withString:(NSString *)texto2{
    NSString *novaString = [NSString stringWithFormat: @"O nome é %@ e %@",
                            texto1, texto2];
    
    self.MyLabel.text = novaString;

}
- (IBAction)changeButtonName:(id)sender {
    [self.NovoBotao setTitle:@"novo" forState:UIControlStateNormal];
}
- (IBAction)callViewController:(id)sender {
    
    NSArray *array = @[@"texto1", @"texto2"];
    
    SecondController *segController = [self.storyboard instantiateViewControllerWithIdentifier:@"SecondController"];
    
    segController.nome = @"Teste novo nome";
    segController.meuArray = array;
    
    [self presentViewController:segController animated:YES completion:nil];
    
    
    
}

@end
