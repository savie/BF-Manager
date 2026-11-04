.class public final Ll/ۜۜۗ;
.super Ll/ܺ۠ۗ;
.source "F6BV"


# static fields
.field public static final ܰ:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Ll/ۜۜۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۜۜۗ;->ܰ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 6

    .line 30
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 33
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 34
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۡۗ;

    .line 35
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    sget-object v4, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-ne v3, v4, :cond_2

    .line 36
    check-cast v2, Ll/ۜ֨ۗ;

    .line 44
    :try_start_0
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۧ֨ۗ;->ᩴ()Ll/֫֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 49
    invoke-virtual {v3}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_0

    .line 52
    :cond_4
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    invoke-virtual {v2}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 53
    invoke-virtual {v4}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_0

    .line 56
    :cond_5
    new-instance v4, Ll/᩷ᩳۗ;

    invoke-virtual {v3}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object v3

    invoke-direct {v4, v3}, Ll/᩷ᩳۗ;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 58
    sget-object v3, Ll/ۜۜۗ;->ܰ:Ll/᩻ܽ᩺;

    const-string v4, "Failed to attach constructor generic info"

    invoke-interface {v3, v4, v2}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method
