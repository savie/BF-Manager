.class public final Ll/۫ܽܽ;
.super Ll/ۤܽܽ;
.source "O7SL"


# static fields
.field public static final ۙ:J

.field public static final ۤ:J

.field public static final ܳ:J

.field public static final ᩴ:J

.field public static final ᩷:Lsun/misc/Unsafe;

.field public static final ᩸:J


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 542
    const-class v0, Ll/ۚܽܽ;

    .line 544
    :try_start_0
    invoke-static {}, Lsun/misc/Unsafe;->getUnsafe()Lsun/misc/Unsafe;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 547
    :catch_0
    :try_start_1
    new-instance v1, Ll/ܳܽܽ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    const-string v2, "java.security.AccessController"

    .line 562
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "doPrivileged"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const-class v6, Ljava/security/PrivilegedExceptionAction;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 563
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v1, v3, v7

    const/4 v1, 0x0

    .line 564
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsun/misc/Unsafe;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 566
    :catch_1
    :try_start_3
    invoke-static {}, Ll/۫ܽܽ;->ۙ()Lsun/misc/Unsafe;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lsun/misc/Unsafe;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 573
    :goto_0
    :try_start_4
    const-class v2, Ll/֫ܽܽ;

    const-string v3, "\u073f"

    .line 575
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll/۫ܽܽ;->᩸:J

    const-string v3, "\u0730"

    .line 577
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll/۫ܽܽ;->ۙ:J

    const-string v3, "\u1a76"

    .line 578
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/۫ܽܽ;->ۤ:J

    const-string v2, "\u1a77"

    .line 579
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/۫ܽܽ;->ܳ:J

    const-string v2, "\u06d9"

    .line 580
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/۫ܽܽ;->ᩴ:J

    .line 581
    sput-object v1, Ll/۫ܽܽ;->᩷:Lsun/misc/Unsafe;
    :try_end_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_4 .. :try_end_4} :catch_2

    return-void

    :catch_2
    move-exception v0

    .line 583
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    .line 569
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Could not initialize intrinsics"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic ۙ()Lsun/misc/Unsafe;
    .locals 1

    .line 0
    invoke-static {}, Ll/۫ܽܽ;->᩷()Lsun/misc/Unsafe;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ᩷()Lsun/misc/Unsafe;
    .locals 6

    .line 549
    const-class v0, Lsun/misc/Unsafe;

    .line 550
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    const/4 v5, 0x1

    .line 551
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v5, 0x0

    .line 552
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 553
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 554
    invoke-virtual {v0, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;

    return-object v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 557
    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldError;

    const-string v1, "the Unsafe"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldError;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;)Ll/ۚܽܽ;
    .locals 2

    .line 625
    :cond_0
    iget-object v0, p1, Ll/֫ܽܽ;->ܿ:Ll/ۚܽܽ;

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 629
    :cond_1
    invoke-virtual {p0, p1, v0, p2}, Ll/۫ܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;Ll/ۚܽܽ;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-object v0
.end method

.method public final ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;)Ll/ۜܺܽ;
    .locals 2

    .line 612
    :cond_0
    iget-object v0, p1, Ll/֫ܽܽ;->ܰ:Ll/ۜܺܽ;

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 616
    :cond_1
    invoke-virtual {p0, p1, v0, p2}, Ll/۫ܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;Ll/ۜܺܽ;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-object v0
.end method

.method public final ۙ(Ll/ۚܽܽ;Ljava/lang/Thread;)V
    .locals 3

    .line 589
    sget-object v0, Ll/۫ܽܽ;->᩷:Lsun/misc/Unsafe;

    sget-wide v1, Ll/۫ܽܽ;->ܳ:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/ۚܽܽ;Ll/ۚܽܽ;)V
    .locals 3

    .line 594
    sget-object v0, Ll/۫ܽܽ;->᩷:Lsun/misc/Unsafe;

    sget-wide v1, Ll/۫ܽܽ;->ᩴ:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    .line 637
    sget-object v0, Ll/۫ܽܽ;->᩷:Lsun/misc/Unsafe;

    sget-wide v2, Ll/۫ܽܽ;->ۤ:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll/ᩴܽܽ;->ۙ(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;Ll/ۚܽܽ;)Z
    .locals 6

    .line 600
    sget-object v0, Ll/۫ܽܽ;->᩷:Lsun/misc/Unsafe;

    sget-wide v2, Ll/۫ܽܽ;->᩸:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll/ᩴܽܽ;->ۙ(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;Ll/ۜܺܽ;)Z
    .locals 6

    .line 606
    sget-object v0, Ll/۫ܽܽ;->᩷:Lsun/misc/Unsafe;

    sget-wide v2, Ll/۫ܽܽ;->ۙ:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll/ᩴܽܽ;->ۙ(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
