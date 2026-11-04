.class public final Ll/֫ܺۙ;
.super Ll/᩻ܺۙ;
.source "195U"


# static fields
.field public static final ۤ:Ll/ۚܺۙ;

.field public static ᩸:Ll/֫ܺۙ;


# instance fields
.field public final ᩷:Landroid/app/Application;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 68
    new-instance v0, Ll/ۚܺۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 332
    sput-object v0, Ll/֫ܺۙ;->ۤ:Ll/ۚܺۙ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 252
    invoke-direct {p0, v0, v1}, Ll/֫ܺۙ;-><init>(Landroid/app/Application;I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 260
    invoke-direct {p0, p1, v0}, Ll/֫ܺۙ;-><init>(Landroid/app/Application;I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;I)V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    iput-object p1, p0, Ll/֫ܺۙ;->᩷:Landroid/app/Application;

    return-void
.end method

.method public static final synthetic ۙ()Ll/֫ܺۙ;
    .locals 1

    .line 237
    sget-object v0, Ll/֫ܺۙ;->᩸:Ll/֫ܺۙ;

    return-object v0
.end method

.method private final ۙ(Ljava/lang/Class;Landroid/app/Application;)Ll/۫ܺۙ;
    .locals 5

    const-string v0, "Cannot create an instance of "

    .line 297
    const-class v1, Ll/ܽۧۙ;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 299
    const-class v3, Landroid/app/Application;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v4

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۫ܺۙ;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    invoke-static {p2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    return-object p2

    :catch_0
    move-exception p2

    .line 307
    new-instance v1, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {p1, v0}, Ll/᩻ۢ᩹;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 307
    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p2

    .line 305
    new-instance v1, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {p1, v0}, Ll/᩻ۢ᩹;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 305
    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception p2

    .line 303
    new-instance v1, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {p1, v0}, Ll/᩻ۢ᩹;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 303
    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception p2

    .line 301
    new-instance v1, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {p1, v0}, Ll/᩻ۢ᩹;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 301
    invoke-direct {v1, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 185
    :cond_0
    invoke-static {p1}, Ll/ۨۤۤ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1
.end method

.method public static final synthetic ۙ(Ll/֫ܺۙ;)V
    .locals 0

    .line 237
    sput-object p0, Ll/֫ܺۙ;->᩸:Ll/֫ܺۙ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;
    .locals 1

    .line 284
    iget-object v0, p0, Ll/֫ܺۙ;->᩷:Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 291
    invoke-direct {p0, p1, v0}, Ll/֫ܺۙ;->ۙ(Ljava/lang/Class;Landroid/app/Application;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 285
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Class;Ll/ۘܺۙ;)Ll/۫ܺۙ;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/֫ܺۙ;->᩷:Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 265
    invoke-virtual {p0, p1}, Ll/֫ܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 267
    :cond_0
    sget-object v0, Ll/֫ܺۙ;->ۤ:Ll/ۚܺۙ;

    .line 107
    invoke-virtual {p2}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 267
    check-cast p2, Landroid/app/Application;

    if-eqz p2, :cond_1

    .line 269
    invoke-direct {p0, p1, p2}, Ll/֫ܺۙ;->ۙ(Ljava/lang/Class;Landroid/app/Application;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 272
    :cond_1
    const-class p2, Ll/ܽۧۙ;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 185
    invoke-static {p1}, Ll/ۨۤۤ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    return-object p1

    .line 273
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "CreationExtras must have an application by `APPLICATION_KEY`"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
