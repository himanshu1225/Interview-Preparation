Arrays vs ArrayList (Java)

Arrays:

 -> Size is fixed from the beginning
 -> Must declare size at the time of creation

Example:
int[] arr = new int[5];

Initialization:
int[] arr = {2, 7, 8};

ArrayList:

 -> Size is dynamic (resizable)
 -> Used when number of elements is unknown

Example:
ArrayList<Integer> list = new ArrayList<>();

Initialization:
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 8, 21));

Data Type Support:

Arrays:

 -> Supports both primitive and object types

Examples:
int[] arr = new int[3];
Integer[] arr2 = new Integer[3];
Employee[] emp = new Employee[5];

ArrayList:

 -> Supports only objects (Wrapper classes)

Example:
ArrayList<Integer> list = new ArrayList<>();

Basic Operations:

Fetch:
Array -> arr[i]
ArrayList -> list.get(i)

Size:
Array -> arr.length
ArrayList -> list.size()

Add element:
Array -> Not possible
ArrayList -> list.add(value)

Remove element:
Array -> Not possible
ArrayList -> list.remove(i)

Replace element:
Array -> arr[i] = value
ArrayList -> list.set(i, value)

Print:
Array -> Use loop
ArrayList -> System.out.println(list)

Key Concepts:

 -> ArrayList implements List interface
 -> List extends Collection interface
 -> Streams are part of Collections framework

Convert to Stream: on this we can perform multiple operations.
list.stream()

Performance:

Arrays:

 -> Faster
 -> No conversion overhead
 -> No resizing

ArrayList:

 -> Slightly slower due to:
 -> Autoboxing:
        list.add(2); // int → Integer
 -> Unboxing:
        int value = list.get(0); // Integer → int
 -> Resizing:
        Default capacity = 10
        Grows by 50% when full

        Example growth:
        10 → 15 → 22 → ...

 -> Requires new array creation and copying elements

When to Use:

Use Array:

When size is known
When performance is critical

Use ArrayList:

When size is unknown
When flexibility is needed (add/remove)