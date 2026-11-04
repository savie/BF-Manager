.class public final Ll/ܿܶۚ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ۙ:I

.field public final ۤ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۖܳۤ;)V
    .locals 7

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    invoke-interface {p1}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v0

    .line 211
    invoke-interface {v0}, Ll/ܳ۫ۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object v1

    .line 212
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-interface {v1}, Ll/ۤ۫ۤ;->۫()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const-string v3, "0x%02x"

    invoke-static {v2, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Ll/ܿܶۚ;->᩷:Ljava/lang/String;

    .line 213
    invoke-interface {v1}, Ll/ۤ۫ۤ;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܿܶۚ;->ۤ:Ljava/lang/String;

    .line 214
    invoke-interface {v0}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v6

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܿܶۚ;->᩸:Ljava/lang/String;

    .line 215
    invoke-interface {v0}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿܶۚ;->ᩴ:Ljava/lang/String;

    .line 216
    invoke-static {p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܿܶۚ;->ܳ:Ljava/lang/String;

    .line 218
    invoke-interface {p1}, Ll/ۖܳۤ;->᩸()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܳۤ;

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 219
    :cond_0
    iput v6, p0, Ll/ܿܶۚ;->ۙ:I

    return-void
.end method
