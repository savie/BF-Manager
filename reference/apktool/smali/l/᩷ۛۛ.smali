.class public final Ll/᩷ۛۛ;
.super Ll/֫᩻ۨ;
.source "S6B2"


# direct methods
.method public constructor <init>(Ll/ۗܰۛ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16850
    iput-object p1, p0, Ll/֫᩻ۨ;->۫:Ll/ۗܰۛ;

    const/16 p1, 0x2b

    .line 16851
    iput p1, p0, Ll/֫᩻ۨ;->᩷:I

    .line 16852
    sget-object p1, Ll/ۗܰۛ;->ۡ:[S

    iput-object p1, p0, Ll/֫᩻ۨ;->᩸:[S

    .line 16853
    sget-object p1, Ll/ۗܰۛ;->֨:[S

    iput-object p1, p0, Ll/֫᩻ۨ;->ۤ:[S

    .line 16854
    sget-object p1, Ll/ۗܰۛ;->۠:[C

    iput-object p1, p0, Ll/֫᩻ۨ;->ܳ:[C

    .line 16855
    sget-object p1, Ll/ۗܰۛ;->ۖ:[C

    iput-object p1, p0, Ll/֫᩻ۨ;->ᩴ:[C

    .line 16856
    sget-object p1, Ll/ۗܰۛ;->ۢ:[S

    iput-object p1, p0, Ll/֫᩻ۨ;->ۙ:[S

    .line 16857
    sget-object p1, Ll/ۗܰۛ;->ۜ:[S

    iput-object p1, p0, Ll/֫᩻ۨ;->ۚ:[S

    .line 16858
    sget-object p1, Ll/ۗܰۛ;->۬:[[S

    iput-object p1, p0, Ll/֫᩻ۨ;->֫:[[S

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 1

    const-string v0, "()* loopback of 785:5: ({...}? annotation )*"

    return-object v0
.end method

.method public final ᩷(ILl/ܺ᩻ۨ;)I
    .locals 3

    .line 16866
    check-cast p2, Ll/ܿ᩻ۨ;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 16870
    invoke-interface {p2, p1}, Ll/ܺ᩻ۨ;->᩷(I)I

    .line 16872
    invoke-interface {p2}, Ll/ܺ᩻ۨ;->index()I

    move-result v0

    .line 16873
    invoke-interface {p2}, Ll/ܺ᩻ۨ;->ܳ()V

    .line 16875
    invoke-interface {p2, p1}, Ll/ܺ᩻ۨ;->᩷(I)I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_0

    const/16 p1, 0x47

    .line 16878
    :cond_0
    invoke-interface {p2, v0}, Ll/ܺ᩻ۨ;->ۙ(I)V

    return p1

    .line 16882
    :cond_1
    new-instance v0, Ll/ۨ᩻ۨ;

    const-string v1, "()* loopback of 785:5: ({...}? annotation )*"

    const/16 v2, 0x2b

    .line 16883
    invoke-direct {v0, v1, v2, p1, p2}, Ll/ۨ᩻ۨ;-><init>(Ljava/lang/String;IILl/ܺ᩻ۨ;)V

    .line 16885
    throw v0
.end method
