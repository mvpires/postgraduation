//
//  ViewController.m
//  NavigationProject
//
//  Created by Treinamento on 29/07/17.
//  Copyright © 2017 Treinamento. All rights reserved.
//

#import "ViewController.h"
#import "VerdeViewController.h"
#import "AmareloViewController.h"
#import "VermelhoViewController.h"

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

- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
    
    if([segue.identifier isEqualToString:@"segueVermelho"]){
        VermelhoViewController *vermelhoViewController = [segue destinationViewController];
        vermelhoViewController.nome = @"nome teste";
        
    }
    else if([segue.identifier isEqualToString:@"segueAmarelo"]){
        
        AmareloViewController * amareloViewController = [segue destinationViewController];
        
        amareloViewController.nome = @"nome teste";
        
    }
    else{
        VerdeViewController *verdeViewController = [segue destinationViewController];
        verdeViewController.nome = @"nome teste";
        
    }
}


@end
