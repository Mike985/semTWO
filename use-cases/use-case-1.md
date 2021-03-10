# USE CASE: 1 Delete an employee's data/record.

## CHARACTERISTIC INFORMATION

### Goal in Context

As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.
### Scope

Company.

### Level

Primary task.

### Preconditions

We know the employee.  Database contains current employee data.

### Success End Condition

The employee's data is deleted.

### Failed End Condition

Employee's details is not deleted

### Primary Actor

HR Advisor.

### Trigger

An employee leaves/ a request is sent to HR to remove someone's details rom the system.

## MAIN SUCCESS SCENARIO

1. Request is made to delete employee record
2. HR advisor captures name of the employee to delete.
3. HR advisor removes data for given employee.

## EXTENSIONS

3. **employee data does not exist**:
    1. HR advisor informs requester no record exists.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0
