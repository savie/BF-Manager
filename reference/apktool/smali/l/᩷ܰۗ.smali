.class public final Ll/᩷ܰۗ;
.super Ljava/lang/Object;
.source "VIU4"

# interfaces
.implements Ll/᩹ۘۗ;


# instance fields
.field public final ۤ:Ll/ۛܰۗ;

.field public final ᩷:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/᩷ܰۗ;->᩷:Ljava/lang/String;

    .line 17
    invoke-static {p2, p3}, Ll/ۛܰۗ;->ۙ(Ljava/util/Map;Ljava/util/Map;)Ll/ۛܰۗ;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܰۗ;->ۤ:Ll/ۛܰۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/᩷ܰۗ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ll/ۛܰۗ;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/᩷ܰۗ;->ۤ:Ll/ۛܰۗ;

    return-object v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/᩷ܰۗ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 2

    .line 32
    iget-object v0, p0, Ll/᩷ܰۗ;->ۤ:Ll/ۛܰۗ;

    sget-object v1, Ll/᩻ܰۗ;->ۙ:Ll/ۛܰۗ;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
