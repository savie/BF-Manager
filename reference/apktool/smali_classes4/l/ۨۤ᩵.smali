.class public final Ll/ۨۤ᩵;
.super Ll/֨ۤ᩵;
.source "26GC"


# instance fields
.field public final ۤ:Ll/᩷ۡۗ;

.field public final ᩷:Ll/֡᩷᩵;


# direct methods
.method public constructor <init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/᩷ۡۗ;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Ll/֨ۤ᩵;-><init>(Ll/۟ۤ᩵;)V

    .line 37
    iput-object p3, p0, Ll/ۨۤ᩵;->ۤ:Ll/᩷ۡۗ;

    .line 38
    iput-object p2, p0, Ll/ۨۤ᩵;->᩷:Ll/֡᩷᩵;

    return-void
.end method

.method public static ۙ(Ll/֡᩷᩵;Ll/᩷ۡۗ;)Ll/۬᩷᩵;
    .locals 1

    .line 14
    new-instance v0, Ll/᩵ۤ᩵;

    invoke-direct {v0, p0, p1}, Ll/᩵ۤ᩵;-><init>(Ll/֡᩷᩵;Ll/᩷ۡۗ;)V

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

    .line 58
    iget-object v0, p0, Ll/ۨۤ᩵;->᩷:Ll/֡᩷᩵;

    return-object v0
.end method

.method public final ۧ()Ll/᩷ۡۗ;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۨۤ᩵;->ۤ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۫()Ll/ᩳۤ᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()Ll/ۧ᩸ۨ;
    .locals 1

    .line 43
    new-instance v0, Ll/ۧۤ᩵;

    invoke-direct {v0, p0}, Ll/ۧۤ᩵;-><init>(Ll/ۨۤ᩵;)V

    return-object v0
.end method

.method public final ᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 3

    .line 73
    iget-object v0, p0, Ll/ۨۤ᩵;->᩷:Ll/֡᩷᩵;

    invoke-virtual {v0}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v0

    .line 74
    new-instance v1, Ll/ۨۤ᩵;

    iget-object v2, p0, Ll/ۨۤ᩵;->ۤ:Ll/᩷ۡۗ;

    invoke-direct {v1, p1, v0, v2}, Ll/ۨۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/᩷ۡۗ;)V

    return-object v1
.end method

.method public final ᩸()Ll/ۢۤ᩵;
    .locals 1

    .line 48
    sget-object v0, Ll/ۢۤ᩵;->ܿ:Ll/ۢۤ᩵;

    return-object v0
.end method
