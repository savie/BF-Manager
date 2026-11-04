.class public abstract Ll/۫ۛܽ;
.super Ljava/lang/Object;
.source "U87V"


# static fields
.field public static final ۙ:Ll/۫ۛܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 87
    invoke-static {}, Ll/ᩳۨܽ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    :try_start_0
    const-class v0, Ljava/lang/reflect/AccessibleObject;

    const-string v1, "canAccess"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 91
    new-instance v1, Ll/ᩴۛܽ;

    invoke-direct {v1, v0}, Ll/ᩴۛܽ;-><init>(Ljava/lang/reflect/Method;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 108
    new-instance v1, Ll/ܳۛܽ;

    .line 81
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 117
    :cond_1
    sput-object v1, Ll/۫ۛܽ;->ۙ:Ll/۫ۛܽ;

    return-void
.end method


# virtual methods
.method public abstract ۙ(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z
.end method
