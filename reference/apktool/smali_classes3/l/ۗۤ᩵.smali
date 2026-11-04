.class public final Ll/ۗۤ᩵;
.super Ll/֨ۤ᩵;
.source "K6CN"


# instance fields
.field public final ۤ:Ll/֡᩷᩵;

.field public final ᩷:Ll/ᩳۤ᩵;


# direct methods
.method public constructor <init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Ll/֨ۤ᩵;-><init>(Ll/۟ۤ᩵;)V

    .line 37
    iput-object p2, p0, Ll/ۗۤ᩵;->ۤ:Ll/֡᩷᩵;

    .line 38
    iput-object p3, p0, Ll/ۗۤ᩵;->᩷:Ll/ᩳۤ᩵;

    return-void
.end method

.method public static ۙ(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)Ll/۬᩷᩵;
    .locals 1

    .line 14
    new-instance v0, Ll/᩹ۤ᩵;

    invoke-direct {v0, p0, p1}, Ll/᩹ۤ᩵;-><init>(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ()Ll/֡᩷᩵;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۗۤ᩵;->ۤ:Ll/֡᩷᩵;

    return-object v0
.end method

.method public final ۫()Ll/ᩳۤ᩵;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۗۤ᩵;->᩷:Ll/ᩳۤ᩵;

    return-object v0
.end method

.method public final ܳ()Ll/ۧ᩸ۨ;
    .locals 1

    .line 55
    new-instance v0, Ll/ۤۤ᩵;

    .line 16
    invoke-direct {v0, p0}, Ll/᩷ۤ᩵;-><init>(Ll/֨ۤ᩵;)V

    return-object v0
.end method

.method public final ᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 3

    .line 70
    iget-object v0, p0, Ll/ۗۤ᩵;->ۤ:Ll/֡᩷᩵;

    invoke-virtual {v0}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v0

    .line 71
    iget-object v1, p0, Ll/ۗۤ᩵;->᩷:Ll/ᩳۤ᩵;

    invoke-virtual {v1}, Ll/ᩳۤ᩵;->ۙ()Ll/ᩳۤ᩵;

    move-result-object v1

    .line 72
    new-instance v2, Ll/ۗۤ᩵;

    invoke-direct {v2, p1, v0, v1}, Ll/ۗۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    return-object v2
.end method

.method public final ᩸()Ll/ۢۤ᩵;
    .locals 1

    .line 43
    sget-object v0, Ll/ۢۤ᩵;->ܿ:Ll/ۢۤ᩵;

    return-object v0
.end method
