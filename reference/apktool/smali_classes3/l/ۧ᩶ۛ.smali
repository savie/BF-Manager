.class public final Ll/ۧ᩶ۛ;
.super Ljava/lang/Object;
.source "R4VP"


# static fields
.field public static ۙ:Ljava/lang/reflect/Method;

.field public static ۤ:Z

.field public static ۫:Ljava/lang/Object;

.field public static ܳ:Ljava/lang/reflect/Constructor;

.field public static ᩴ:Ljava/lang/Class;

.field public static ᩷:Ljava/lang/reflect/Field;

.field public static ᩸:Z


# direct methods
.method public static ۙ(Ljava/util/List;Ljava/lang/Object;I)I
    .locals 3

    .line 50
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_0

    .line 51
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    .line 53
    :cond_0
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll/۠ۨۛ;->۟:Ljava/util/Comparator;

    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_1

    return p2

    :cond_1
    if-gez v0, :cond_5

    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 59
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_4

    .line 60
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_3

    return p2

    :cond_3
    if-lez v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    neg-int p0, p2

    return p0

    .line 69
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    return p0

    :cond_5
    const/4 v0, -0x1

    add-int/2addr p2, v0

    :goto_0
    if-ltz p2, :cond_8

    .line 73
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_6

    return p2

    :cond_6
    if-gez v2, :cond_7

    add-int/lit8 p2, p2, 0x2

    neg-int p0, p2

    return p0

    :cond_7
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_8
    return v0
.end method

.method public static ۙ(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    .line 504
    :pswitch_0
    invoke-static {p0}, Ll/ۚ֨ܺ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "unknown-"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-string p0, "invoke-custom"

    return-object p0

    :pswitch_2
    const-string p0, "invoke-polymorphic"

    return-object p0

    :pswitch_3
    const-string p0, "fill-array-data"

    return-object p0

    :pswitch_4
    const-string p0, "move-result-pseudo"

    return-object p0

    :pswitch_5
    const-string p0, "move-result"

    return-object p0

    :pswitch_6
    const-string p0, "invoke-interface"

    return-object p0

    :pswitch_7
    const-string p0, "invoke-direct"

    return-object p0

    :pswitch_8
    const-string p0, "invoke-super"

    return-object p0

    :pswitch_9
    const-string p0, "invoke-virtual"

    return-object p0

    :pswitch_a
    const-string p0, "invoke-static"

    return-object p0

    :pswitch_b
    const-string p0, "put-static"

    return-object p0

    :pswitch_c
    const-string p0, "put-field"

    return-object p0

    :pswitch_d
    const-string p0, "get-static"

    return-object p0

    :pswitch_e
    const-string p0, "get-field"

    return-object p0

    :pswitch_f
    const-string p0, "instance-of"

    return-object p0

    :pswitch_10
    const-string p0, "check-cast"

    return-object p0

    :pswitch_11
    const-string p0, "filled-new-array"

    return-object p0

    :pswitch_12
    const-string p0, "new-array"

    return-object p0

    :pswitch_13
    const-string p0, "new-instance"

    return-object p0

    :pswitch_14
    const-string p0, "aput"

    return-object p0

    :pswitch_15
    const-string p0, "aget"

    return-object p0

    :pswitch_16
    const-string p0, "monitor-exit"

    return-object p0

    :pswitch_17
    const-string p0, "monitor-enter"

    return-object p0

    :pswitch_18
    const-string p0, "throw"

    return-object p0

    :pswitch_19
    const-string p0, "array-length"

    return-object p0

    :pswitch_1a
    const-string p0, "return"

    return-object p0

    :pswitch_1b
    const-string p0, "to-short"

    return-object p0

    :pswitch_1c
    const-string p0, "to-char"

    return-object p0

    :pswitch_1d
    const-string p0, "to-byte"

    return-object p0

    :pswitch_1e
    const-string p0, "conv"

    return-object p0

    :pswitch_1f
    const-string p0, "cmpg"

    return-object p0

    :pswitch_20
    const-string p0, "cmpl"

    return-object p0

    :pswitch_21
    const-string p0, "not"

    return-object p0

    :pswitch_22
    const-string p0, "ushr"

    return-object p0

    :pswitch_23
    const-string p0, "shr"

    return-object p0

    :pswitch_24
    const-string p0, "shl"

    return-object p0

    :pswitch_25
    const-string p0, "xor"

    return-object p0

    :pswitch_26
    const-string p0, "or"

    return-object p0

    :pswitch_27
    const-string p0, "and"

    return-object p0

    :pswitch_28
    const-string p0, "neg"

    return-object p0

    :pswitch_29
    const-string p0, "rem"

    return-object p0

    :pswitch_2a
    const-string p0, "div"

    return-object p0

    :pswitch_2b
    const-string p0, "mul"

    return-object p0

    :pswitch_2c
    const-string p0, "sub"

    return-object p0

    :pswitch_2d
    const-string p0, "add"

    return-object p0

    :pswitch_2e
    const-string p0, "switch"

    return-object p0

    :pswitch_2f
    const-string p0, "if-gt"

    return-object p0

    :pswitch_30
    const-string p0, "if-le"

    return-object p0

    :pswitch_31
    const-string p0, "if-ge"

    return-object p0

    :pswitch_32
    const-string p0, "if-lt"

    return-object p0

    :pswitch_33
    const-string p0, "if-ne"

    return-object p0

    :pswitch_34
    const-string p0, "if-eq"

    return-object p0

    :pswitch_35
    const-string p0, "goto"

    return-object p0

    :pswitch_36
    const-string p0, "const"

    return-object p0

    :pswitch_37
    const-string p0, "move-exception"

    return-object p0

    :pswitch_38
    const-string p0, "move-param"

    return-object p0

    :pswitch_39
    const-string p0, "move"

    return-object p0

    :pswitch_3a
    const-string p0, "nop"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ۙ(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(ILjava/lang/String;)V
    .locals 5

    if-eqz p1, :cond_4

    .line 97
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    invoke-static {}, Ll/ۧ᩶ۛ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 106
    :cond_1
    sget-object v0, Ll/ۧ᩶ۛ;->ۙ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    :try_start_0
    new-array v4, v2, [Ljava/lang/Object;

    aput-object p1, v4, v1

    .line 108
    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :catch_0
    :cond_2
    :try_start_1
    sget-object v0, Ll/ۧ᩶ۛ;->ܳ:Ljava/lang/reflect/Constructor;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    aput-object p0, v4, v2

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 119
    sget-object p1, Ll/ۧ᩶ۛ;->۫:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    :try_start_2
    sget-object p1, Ll/ۧ᩶ۛ;->᩷:Ljava/lang/reflect/Field;

    invoke-virtual {p1, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_3

    .line 124
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    monitor-exit v0

    goto :goto_0

    .line 127
    :cond_3
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_4
    :goto_0
    return-void
.end method

.method public static declared-synchronized ۙ()Z
    .locals 10

    .line 2
    const-class v0, Ll/ۧ᩶ۛ;

    .line 3
    monitor-enter v0

    .line 30
    :try_start_0
    sget-boolean v1, Ll/ۧ᩶ۛ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 31
    monitor-exit v0

    return v2

    .line 35
    :cond_0
    :try_start_1
    sget-boolean v1, Ll/ۧ᩶ۛ;->ۤ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 36
    monitor-exit v0

    return v3

    :cond_1
    :try_start_2
    const-string v1, "miui.content.res.IconCustomizer"

    .line 40
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v4, "clearCache"

    new-array v5, v2, [Ljava/lang/Class;

    .line 41
    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v3

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    sput-object v1, Ll/ۧ᩶ۛ;->ۙ:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :try_start_3
    const-string v1, "android.app.ApplicationPackageManager"

    .line 50
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v4

    .line 54
    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v4, v6

    .line 55
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "ResourceName"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 56
    sput-object v7, Ll/ۧ᩶ۛ;->ᩴ:Ljava/lang/Class;

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 61
    :cond_3
    :goto_1
    sget-object v4, Ll/ۧ᩶ۛ;->ᩴ:Ljava/lang/Class;

    if-eqz v4, :cond_4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Class;

    .line 66
    const-class v6, Ljava/lang/String;

    aput-object v6, v5, v3

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    sput-object v4, Ll/ۧ᩶ۛ;->ܳ:Ljava/lang/reflect/Constructor;

    .line 67
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v4, "sSync"

    .line 70
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 71
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v5, 0x0

    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sput-object v4, Ll/ۧ᩶ۛ;->۫:Ljava/lang/Object;

    const-string v4, "sIconCache"

    .line 75
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Ll/ۧ᩶ۛ;->᩷:Ljava/lang/reflect/Field;

    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 78
    sput-boolean v2, Ll/ۧ᩶ۛ;->᩸:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    monitor-exit v0

    return v2

    .line 62
    :cond_4
    :try_start_4
    new-instance v1, Ljava/lang/NoSuchFieldException;

    const-string v4, "ResourceName class not found"

    invoke-direct {v1, v4}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 83
    :catch_1
    :try_start_5
    sput-boolean v2, Ll/ۧ᩶ۛ;->ۤ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 84
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method
