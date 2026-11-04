.class public final enum Ll/۬ܿۗ;
.super Ljava/lang/Enum;
.source "LIYC"


# static fields
.field public static final enum ֡:Ll/۬ܿۗ;

.field public static final enum ۟:Ll/۬ܿۗ;

.field public static final enum ܿ:Ll/۬ܿۗ;

.field public static final enum ᩳ:Ll/۬ܿۗ;

.field public static final synthetic ᩶:[Ll/۬ܿۗ;


# instance fields
.field public final ܰ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Ll/۬ܿۗ;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "APP"

    invoke-direct {v0, v3, v1, v2}, Ll/۬ܿۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/۬ܿۗ;->۟:Ll/۬ܿۗ;

    .line 5
    new-instance v0, Ll/۬ܿۗ;

    const/4 v1, 0x1

    const-string v2, "android.jar"

    const-string v3, "CORE"

    invoke-direct {v0, v3, v1, v2}, Ll/۬ܿۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/۬ܿۗ;->ᩳ:Ll/۬ܿۗ;

    .line 6
    new-instance v0, Ll/۬ܿۗ;

    const/4 v1, 0x2

    const-string v2, "android.car.jar"

    const-string v3, "ANDROID_CAR"

    invoke-direct {v0, v3, v1, v2}, Ll/۬ܿۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/۬ܿۗ;->ܿ:Ll/۬ܿۗ;

    .line 7
    new-instance v0, Ll/۬ܿۗ;

    const/4 v1, 0x3

    const-string v2, "org.apache.http.legacy.jar"

    const-string v3, "APACHE_HTTP_LEGACY_CLIENT"

    invoke-direct {v0, v3, v1, v2}, Ll/۬ܿۗ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll/۬ܿۗ;->֡:Ll/۬ܿۗ;

    .line 3
    invoke-static {}, Ll/۬ܿۗ;->᩸()[Ll/۬ܿۗ;

    move-result-object v0

    sput-object v0, Ll/۬ܿۗ;->᩶:[Ll/۬ܿۗ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 12
    iput-object p3, p0, Ll/۬ܿۗ;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۬ܿۗ;
    .locals 1

    .line 3
    const-class v0, Ll/۬ܿۗ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۬ܿۗ;

    return-object p0
.end method

.method public static values()[Ll/۬ܿۗ;
    .locals 1

    .line 3
    sget-object v0, Ll/۬ܿۗ;->᩶:[Ll/۬ܿۗ;

    invoke-virtual {v0}, [Ll/۬ܿۗ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۬ܿۗ;

    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;)Ll/۬ܿۗ;
    .locals 5

    .line 20
    invoke-static {}, Ll/۬ܿۗ;->values()[Ll/۬ܿۗ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 21
    invoke-virtual {v3}, Ll/۬ܿۗ;->ۙ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25
    :cond_1
    sget-object p0, Ll/۬ܿۗ;->۟:Ll/۬ܿۗ;

    return-object p0
.end method

.method public static synthetic ᩸()[Ll/۬ܿۗ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/۬ܿۗ;

    .line 3
    sget-object v1, Ll/۬ܿۗ;->۟:Ll/۬ܿۗ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ܿۗ;->ᩳ:Ll/۬ܿۗ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ܿۗ;->ܿ:Ll/۬ܿۗ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ܿۗ;->֡:Ll/۬ܿۗ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ۙ()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Ll/۬ܿۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method
