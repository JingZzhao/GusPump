Design parttern requirement indications

1.State Pattern(De-centralized)
  a.Implemented in package "state" of the GasPumpSystem.
  b.MDA_EFSM(in package "CS586") is the state-based component.
  c.GP_State is the abstract State superclass.
  d.Start, S0, S1, S2, S3, S4, S5, S6, S8 are State subclasses.
  e.State classes are responsible for performing both actions and state transitions.

2.Strategy Pattern
  a.Implemented in package "outPut" of the GasPumpSystem
  b.Output(in package "CS586") is the client class that needs to be initialized with proper action strategies.
  c.GP_1 and GP_2(in package "gasPump") specific implementation for the meta-actions of the model according to specifications for their respective gas pump requirements.
  d.DS_1 and DS_2 inherite from DataStore(in package "data"), they store data for GasPump1 and GasPump2 respectively.

3.Abstract Factory Pattern
  a.Implemented in package "abstractFactory" of the GasPumpSystem.
  b.GP_Factory is the abstract superclass.
  c.GP_Factory1 is the factory that returns the necessary driver objects for GasPump1.
  d.GP_Factory2 is the factory that returns the necessary driver objects for GasPump2.


Note:

1.Doing any operation without activating, it will show needing activation operation first.

2.For PayDebit method in GasPump1, you need to initialize pin before you enter pin and check pin.

How to run

To run the executable .jar, from the root directory of the project:
$ java -jar CS586_project_JingZhao/GasPumpSystem.jar
