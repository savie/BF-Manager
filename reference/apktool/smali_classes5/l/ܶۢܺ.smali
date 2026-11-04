.class public final Ll/ܶۢܺ;
.super Ll/᩷ۢܺ;
.source "4BHP"


# instance fields
.field public final synthetic ۙ:Ll/᩹ۢܺ;


# direct methods
.method public constructor <init>(Ll/᩹ۢܺ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 343
    iput-object p1, p0, Ll/ܶۢܺ;->ۙ:Ll/᩹ۢܺ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩶֡ܺ;)Ll/᩶֡ܺ;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 362
    :cond_0
    invoke-virtual {p1}, Ll/᩶֡ܺ;->᩹()I

    move-result v0

    .line 378
    iget-object v1, p0, Ll/ܶۢܺ;->ۙ:Ll/᩹ۢܺ;

    invoke-static {v1}, Ll/᩹ۢܺ;->᩷(Ll/᩹ۢܺ;)[Ll/᩶֡ܺ;

    move-result-object v1

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ll/᩶֡ܺ;->᩹()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶֡ܺ;->᩷(I)Ll/᩶֡ܺ;

    move-result-object p1

    return-object p1
.end method
