.class public abstract Ll/᩹᩵ۨ;
.super Ll/ۘ᩵ۨ;
.source "B7IH"


# instance fields
.field public ۤ:Ljava/util/function/UnaryOperator;

.field public ᩴ:Ll/ܽ᩵ۨ;

.field public ᩷:Ll/ܿ᩵ۨ;

.field public ᩸:Ll/ܿ᩵ۨ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 131
    invoke-direct {p0, v0}, Ll/۠᩷᩻;-><init>(I)V

    .line 50
    sget v0, Ll/᩵᩵ۨ;->ᩴ:I

    .line 158
    invoke-static {}, Ll/ܶ᩵ۨ;->ۙ()Ll/ܽ᩵ۨ;

    move-result-object v0

    .line 50
    iput-object v0, p0, Ll/᩹᩵ۨ;->ᩴ:Ll/ܽ᩵ۨ;

    .line 51
    sget-object v0, Ll/ܿ᩵ۨ;->ܰ:Ll/ܿ᩵ۨ;

    iput-object v0, p0, Ll/᩹᩵ۨ;->᩸:Ll/ܿ᩵ۨ;

    .line 52
    iput-object v0, p0, Ll/᩹᩵ۨ;->᩷:Ll/ܿ᩵ۨ;

    .line 150
    invoke-static {}, Ll/ۢۧۗ;->identity()Ljava/util/function/UnaryOperator;

    move-result-object v0

    .line 53
    iput-object v0, p0, Ll/᩹᩵ۨ;->ۤ:Ljava/util/function/UnaryOperator;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܽ᩵ۨ;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/᩹᩵ۨ;->ᩴ:Ll/ܽ᩵ۨ;

    return-object v0
.end method

.method public final ۙ(Ll/ܽ᩵ۨ;)V
    .locals 0

    .line 118
    iput-object p1, p0, Ll/᩹᩵ۨ;->ᩴ:Ll/ܽ᩵ۨ;

    return-void
.end method

.method public final ۚ()Ll/ܿ᩵ۨ;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/᩹᩵ۨ;->᩸:Ll/ܿ᩵ۨ;

    return-object v0
.end method

.method public final ۫()Ljava/util/function/UnaryOperator;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩹᩵ۨ;->ۤ:Ljava/util/function/UnaryOperator;

    return-object v0
.end method

.method public final ܳ()Ll/ܿ᩵ۨ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩹᩵ۨ;->᩷:Ll/ܿ᩵ۨ;

    return-object v0
.end method
