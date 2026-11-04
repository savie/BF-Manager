.class public final Ll/᩻ۖۗ;
.super Ljava/lang/Object;
.source "N6GO"


# static fields
.field public static final ۙ:Ljava/util/regex/Pattern;

.field public static final ᩷:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Ll/᩻ۖۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/᩻ۖۗ;->᩷:Ll/᩻ܽ᩺;

    const-string v0, "classes([1-9]\\d*)\\.dex"

    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻ۖۗ;->ۙ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)I
    .locals 3

    const-string v0, "classes.dex"

    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, -0x1

    .line 60
    :try_start_0
    sget-object v2, Ll/᩻ۖۗ;->ۙ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    .line 64
    :cond_1
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "1"

    .line 65
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v0

    .line 68
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 70
    sget-object v1, Ll/᩻ۖۗ;->᩷:Ll/᩻ܽ᩺;

    const-string v2, "Failed to parse source classes index"

    invoke-interface {v1, v2, p0}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public static ۙ(Ljava/util/List;)Ll/᩻ۡۗ;
    .locals 5

    .line 24
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    if-nez v0, :cond_1

    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v3}, Ll/᩻ۡۗ;->᩵ۙ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩻ۖۗ;->ۙ(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v1, :cond_0

    if-eq v2, v1, :cond_2

    if-ge v4, v2, :cond_0

    .line 44
    :cond_2
    :goto_1
    invoke-virtual {v3}, Ll/᩻ۡۗ;->᩵ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۖۗ;->ۙ(Ljava/lang/String;)I

    move-result v2

    move-object v0, v3

    goto :goto_0

    :cond_3
    return-object v0
.end method
