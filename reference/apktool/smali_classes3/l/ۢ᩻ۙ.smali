.class public final Ll/ۢ᩻ۙ;
.super Ljava/lang/Object;
.source "NIXX"


# instance fields
.field public ۙ:Ll/ۨܺۙ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 40
    new-instance v0, Ll/ۨܺۙ;

    .line 27
    invoke-static {}, Ll/ۚᩳ᩵;->ۙ()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨܺۙ;-><init>(Ljava/util/Map;)V

    .line 40
    iput-object v0, p0, Ll/ۢ᩻ۙ;->ۙ:Ll/ۨܺۙ;

    return-void
.end method

.method public constructor <init>(Ll/ܰᩳ᩵;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    new-instance v0, Ll/ۨܺۙ;

    invoke-direct {v0, p1}, Ll/ۨܺۙ;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Ll/ۢ᩻ۙ;->ۙ:Ll/ۨܺۙ;

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/᩵ܺۙ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۢ᩻ۙ;->ۙ:Ll/ۨܺۙ;

    invoke-virtual {v0}, Ll/ۨܺۙ;->ۙ()Ll/᩵ܺۙ;

    move-result-object v0

    return-object v0
.end method
