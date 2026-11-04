.class public final Ll/᩺ۨܽ;
.super Ljava/lang/Object;
.source "W8AM"


# instance fields
.field public final ۙ:Ljava/util/Map;

.field public final ᩷:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/Map;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p2, p0, Ll/᩺ۨܽ;->ۙ:Ljava/util/Map;

    .line 56
    iput-object p1, p0, Ll/᩺ۨܽ;->᩷:Ljava/util/List;

    return-void
.end method

.method public static ۙ(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    .line 67
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 73
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "r8-abstract-class"

    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 399
    iget-object v0, p0, Ll/᩺ۨܽ;->ۙ:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۛܰܽ;Z)Ll/᩸ۛܽ;
    .locals 5

    .line 104
    invoke-virtual {p1}, Ll/ۛܰܽ;->᩷()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 105
    invoke-virtual {p1}, Ll/ۛܰܽ;->ۙ()Ljava/lang/Class;

    move-result-object p1

    .line 110
    iget-object v1, p0, Ll/᩺ۨܽ;->ۙ:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ᩵ܽ;

    if-eqz v2, :cond_0

    .line 112
    new-instance p1, Ll/ۨۨܽ;

    invoke-direct {p1, v2, v0}, Ll/ۨۨܽ;-><init>(Ll/ܰ᩵ܽ;Ljava/lang/reflect/Type;)V

    return-object p1

    .line 117
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ᩵ܽ;

    if-eqz v1, :cond_1

    .line 119
    new-instance p1, Ll/ۨۨܽ;

    invoke-direct {p1, v1, v0}, Ll/ۨۨܽ;-><init>(Ll/ܰ᩵ܽ;Ljava/lang/reflect/Type;)V

    return-object p1

    .line 179
    :cond_1
    const-class v1, Ljava/util/EnumSet;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 180
    new-instance v1, Ll/ۙ᩻ۧ;

    const/4 v3, 0x4

    invoke-direct {v1, v3, v0}, Ll/ۙ᩻ۧ;-><init>(ILjava/lang/Object;)V

    goto :goto_0

    .line 197
    :cond_2
    const-class v1, Ljava/util/EnumMap;

    if-ne p1, v1, :cond_3

    .line 198
    new-instance v1, Ll/ܿۛܳ;

    invoke-direct {v1, v0}, Ll/ܿۛܳ;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_4

    return-object v1

    .line 130
    :cond_4
    iget-object v0, p0, Ll/᩺ۨܽ;->᩷:Ljava/util/List;

    .line 131
    invoke-static {p1, v0}, Ll/ۚۛܽ;->ۙ(Ljava/lang/Class;Ljava/util/List;)Ll/ۤۨܽ;

    move-result-object v0

    .line 220
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    .line 226
    :cond_5
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    sget-object v3, Ll/ۤۨܽ;->᩶:Ll/ۤۨܽ;

    if-eq v0, v3, :cond_7

    .line 78
    sget-object v4, Ll/۫ۛܽ;->ۙ:Ll/۫ۛܽ;

    invoke-virtual {v4, v2, v1}, Ll/۫ۛܽ;->ۙ(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 233
    sget-object v4, Ll/ۤۨܽ;->ܿ:Ll/ۤۨܽ;

    if-ne v0, v4, :cond_7

    .line 237
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_6
    const-string v1, "Unable to invoke no-args constructor of "

    const-string v3, "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."

    .line 0
    invoke-static {p1, v1, v3}, Ll/᩵ۨܽ;->ۙ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 247
    new-instance v3, Ll/ۛۨܽ;

    invoke-direct {v3, v1}, Ll/ۛۨܽ;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    :goto_1
    if-ne v0, v3, :cond_8

    .line 253
    invoke-static {v1}, Ll/֫ܰܽ;->᩷(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 255
    new-instance v1, Ll/ۛۨܽ;

    invoke-direct {v1, v3}, Ll/ۛۨܽ;-><init>(Ljava/lang/String;)V

    move-object v3, v1

    goto :goto_3

    .line 259
    :cond_8
    new-instance v3, Ll/ۛᩴܺ;

    const/4 v4, 0x5

    invoke-direct {v3, v4, v1}, Ll/ۛᩴܺ;-><init>(ILjava/lang/Object;)V

    goto :goto_3

    :catch_0
    :goto_2
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_9

    return-object v3

    .line 299
    :cond_9
    const-class v1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 319
    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 320
    new-instance v2, Ll/᩸ᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_4

    .line 323
    :cond_a
    const-class v1, Ljava/util/LinkedHashSet;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 324
    new-instance v2, Ll/۫۫ۤ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    .line 327
    :cond_b
    const-class v1, Ljava/util/TreeSet;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 328
    new-instance v2, Ll/ܰ۟ۙ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    .line 331
    :cond_c
    const-class v1, Ljava/util/ArrayDeque;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 332
    new-instance v2, Ll/ۚܽۤ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    .line 305
    :cond_d
    const-class v1, Ljava/util/Map;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 341
    const-class v1, Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 342
    new-instance v2, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;

    const/4 v1, 0x4

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;-><init>(I)V

    goto :goto_4

    .line 345
    :cond_e
    const-class v1, Ljava/util/TreeMap;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 346
    new-instance v2, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;

    const/4 v1, 0x7

    invoke-direct {v2, v1}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;-><init>(I)V

    goto :goto_4

    .line 349
    :cond_f
    const-class v1, Ll/ܽ֫ۗ;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 350
    new-instance v2, Ll/᩻ۢ᩹;

    const/16 v1, 0x9

    invoke-direct {v2, v1}, Ll/᩻ۢ᩹;-><init>(I)V

    goto :goto_4

    .line 353
    :cond_10
    const-class v1, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 354
    new-instance v2, Ll/᩵ۨܽ;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Ll/᩵ۨܽ;-><init>(I)V

    :cond_11
    :goto_4
    if-eqz v2, :cond_12

    return-object v2

    .line 144
    :cond_12
    invoke-static {p1}, Ll/᩺ۨܽ;->ۙ(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_13

    .line 146
    new-instance p1, Ll/ۛۨܽ;

    invoke-direct {p1, v1}, Ll/ۛۨܽ;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_13
    const-string v1, "Unable to create instance of "

    if-nez p2, :cond_14

    const-string p2, "; Register an InstanceCreator or a TypeAdapter for this type."

    .line 0
    invoke-static {p1, v1, p2}, Ll/᩵ۨܽ;->ۙ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 154
    new-instance p2, Ll/ۛۨܽ;

    invoke-direct {p2, p1}, Ll/ۛۨܽ;-><init>(Ljava/lang/String;)V

    return-object p2

    .line 159
    :cond_14
    sget-object p2, Ll/ۤۨܽ;->᩶:Ll/ۤۨܽ;

    if-eq v0, p2, :cond_15

    const-string p2, "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."

    .line 0
    invoke-static {p1, v1, p2}, Ll/᩵ۨܽ;->ۙ(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 166
    new-instance p2, Ll/ۛۨܽ;

    invoke-direct {p2, p1}, Ll/ۛۨܽ;-><init>(Ljava/lang/String;)V

    return-object p2

    .line 363
    :cond_15
    new-instance p2, Ll/ۤܰۤ;

    invoke-direct {p2, p1}, Ll/ۤܰۤ;-><init>(Ljava/lang/Object;)V

    return-object p2
.end method
