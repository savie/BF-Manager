.class public final Ll/۫᩻ۙ;
.super Ljava/lang/Object;
.source "4967"


# static fields
.field public static final ۙ:Ljava/util/HashMap;

.field public static final ᩷:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۫᩻ۙ;->ۙ:Ljava/util/HashMap;

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۫᩻ۙ;->᩷:Ljava/util/HashMap;

    return-void
.end method

.method public static ۙ(Ljava/lang/Class;)I
    .locals 8

    .line 107
    sget-object v0, Ll/۫᩻ۙ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 109
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 118
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    goto/16 :goto_6

    :cond_1
    const/4 v1, 0x0

    .line 81
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v3

    .line 82
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_2

    .line 83
    invoke-virtual {v3}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_2
    const-string v3, ""

    .line 86
    :goto_0
    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "substring(...)"

    invoke-static {v4, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-static {v4}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    const-string v5, "."

    const-string v6, "_"

    .line 165
    invoke-static {v4, v5, v6}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "_LifecycleAdapter"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 91
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 90
    :goto_2
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object p0, v4, v5

    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v4

    if-nez v4, :cond_5

    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    .line 102
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-object v3, v1

    .line 122
    :cond_5
    :goto_3
    sget-object v4, Ll/۫᩻ۙ;->᩷:Ljava/util/HashMap;

    if-eqz v3, :cond_6

    .line 123
    invoke-static {v3}, Ll/۟۟᩵;->ۙ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v4, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    .line 127
    :cond_6
    sget-object v3, Ll/ۗۧۙ;->ۤ:Ll/ۗۧۙ;

    invoke-virtual {v3, p0}, Ll/ۗۧۙ;->᩷(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_6

    .line 131
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    .line 159
    const-class v5, Ll/᩷᩻ۙ;

    if-eqz v3, :cond_9

    invoke-virtual {v5, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 134
    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-static {v3}, Ll/۫᩻ۙ;->ۙ(Ljava/lang/Class;)I

    move-result v1

    if-ne v1, v2, :cond_8

    goto :goto_6

    .line 137
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 139
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ll/֨֨᩵;->ۙ([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    if-eqz v6, :cond_a

    .line 159
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 143
    invoke-static {v6}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-static {v6}, Ll/۫᩻ۙ;->ۙ(Ljava/lang/Class;)I

    move-result v7

    if-ne v7, v2, :cond_b

    goto :goto_6

    :cond_b
    if-nez v1, :cond_c

    .line 147
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    :cond_c
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v1, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_4

    :cond_d
    if-eqz v1, :cond_e

    .line 152
    invoke-virtual {v4, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    const/4 v2, 0x2

    .line 111
    :cond_e
    :goto_6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 112
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method public static final ۙ(Ll/᩷᩻ۙ;)Ll/ۙ᩻ۙ;
    .locals 5

    const-string v0, "object"

    .line 5
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    instance-of v0, p0, Ll/ۙ᩻ۙ;

    .line 35
    instance-of v1, p0, Ll/ۨۧۙ;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 37
    new-instance v0, Ll/᩺ۧۙ;

    .line 38
    move-object v1, p0

    check-cast v1, Ll/ۨۧۙ;

    .line 39
    check-cast p0, Ll/ۙ᩻ۙ;

    .line 37
    invoke-direct {v0, v1, p0}, Ll/᩺ۧۙ;-><init>(Ll/ۨۧۙ;Ll/ۙ᩻ۙ;)V

    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    .line 43
    new-instance v0, Ll/᩺ۧۙ;

    check-cast p0, Ll/ۨۧۙ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/᩺ۧۙ;-><init>(Ll/ۨۧۙ;Ll/ۙ᩻ۙ;)V

    return-object v0

    :cond_1
    if-eqz v0, :cond_2

    .line 46
    check-cast p0, Ll/ۙ᩻ۙ;

    return-object p0

    .line 48
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 49
    invoke-static {v0}, Ll/۫᩻ۙ;->ۙ(Ljava/lang/Class;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    .line 51
    sget-object v1, Ll/۫᩻ۙ;->᩷:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    .line 52
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    .line 53
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p0}, Ll/۫᩻ۙ;->ۙ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ll/ܰۧۙ;

    move-result-object p0

    .line 54
    new-instance v0, Ll/ܳܺۙ;

    invoke-direct {v0, p0}, Ll/ܳܺۙ;-><init>(Ll/ܰۧۙ;)V

    return-object v0

    .line 57
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v3, v1, [Ll/ܰۧۙ;

    :goto_0
    if-ge v2, v1, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Constructor;

    invoke-static {v4, p0}, Ll/۫᩻ۙ;->ۙ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ll/ܰۧۙ;

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 58
    :cond_4
    new-instance p0, Ll/᩵ۧۙ;

    invoke-direct {p0, v3}, Ll/᩵ۧۙ;-><init>([Ll/ܰۧۙ;)V

    return-object p0

    .line 60
    :cond_5
    new-instance v0, Ll/ܰ᩻ۙ;

    invoke-direct {v0, p0}, Ll/ܰ᩻ۙ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۙ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ll/ܰۧۙ;
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 67
    invoke-static {p0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast p0, Ll/ܰۧۙ;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 74
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 72
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p0

    .line 70
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
