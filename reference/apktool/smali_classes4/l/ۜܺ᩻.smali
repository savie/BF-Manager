.class public final Ll/ۜܺ᩻;
.super Ll/ۗܺۨ;
.source "N6PY"


# instance fields
.field public final synthetic ܳ:Ll/ۙܽ᩻;

.field public ᩴ:I


# direct methods
.method public constructor <init>(Ll/۬ܺۨ;Ll/ۙܽ᩻;)V
    .locals 0

    .line 145
    iput-object p2, p0, Ll/ۜܺ᩻;->ܳ:Ll/ۙܽ᩻;

    check-cast p1, Ll/ܰܺۨ;

    invoke-direct {p0, p1}, Ll/ۗܺۨ;-><init>(Ll/ܰܺۨ;)V

    return-void
.end method


# virtual methods
.method public final ܳ(I)I
    .locals 2

    .line 150
    iget-object v0, p0, Ll/ۜܺ᩻;->ܳ:Ll/ۙܽ᩻;

    invoke-virtual {v0}, Ll/ۙܽ᩻;->ۙ()V

    .line 151
    invoke-virtual {p0}, Ll/ۗܺۨ;->size()I

    move-result v0

    const v1, 0x30d40

    if-ge v0, v1, :cond_0

    .line 152
    invoke-virtual {p0}, Ll/ۗܺۨ;->size()I

    move-result v0

    sub-int/2addr v1, v0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-super {p0, p1}, Ll/ۗܺۨ;->ܳ(I)I

    move-result p1

    return p1

    .line 151
    :cond_0
    sget-object p1, Ll/ᩴܽ᩻;->֡:Ll/ᩴܽ᩻;

    const-string v0, "Token count limit exceeded"

    invoke-static {p1, v0}, Ll/ܳܽ᩻;->ۙ(Ll/ᩴܽ᩻;Ljava/lang/String;)Ll/ۤܽ᩻;

    move-result-object p1

    throw p1
.end method

.method public final ᩸(I)Ll/۠ܺۨ;
    .locals 1

    .line 158
    iget v0, p0, Ll/ۜܺ᩻;->ᩴ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۜܺ᩻;->ᩴ:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۜܺ᩻;->ܳ:Ll/ۙܽ᩻;

    invoke-virtual {v0}, Ll/ۙܽ᩻;->ۙ()V

    .line 159
    :cond_0
    invoke-super {p0, p1}, Ll/ۗܺۨ;->᩸(I)Ll/۠ܺۨ;

    move-result-object p1

    return-object p1
.end method
