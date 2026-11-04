.class public Ll/ۤ֨ۗ;
.super Ll/᩷֨ۗ;
.source "J6GG"


# instance fields
.field public final ۤۙ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ll/֫֨ۗ;-><init>()V

    .line 236
    iput-object p1, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    .line 237
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    iput p1, p0, Ll/֫֨ۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 262
    iget-object v0, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۙ(Ljava/lang/Object;)Z
    .locals 1

    .line 257
    check-cast p1, Ll/ۤ֨ۗ;

    iget-object p1, p1, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܶ()Ll/ۨ֨ۗ;
    .locals 1

    .line 252
    sget-object v0, Ll/ۨ֨ۗ;->۬:Ll/ۨ֨ۗ;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Ll/ۤ֨ۗ;->ۤۙ:Ljava/lang/String;

    return-object v0
.end method
