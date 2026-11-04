.class public abstract Ll/ᩳۙܽ;
.super Ll/֡۬ܺ;
.source "O3OZ"


# instance fields
.field public ֡:I

.field public final ۟:Z

.field public final ۢ:Ll/᩷ۙܽ;

.field public ܿ:I

.field public final ᩳ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ll/֨ۙܽ;Ljava/lang/CharSequence;)V
    .locals 2

    .line 551
    invoke-direct {p0}, Ll/֡۬ܺ;-><init>()V

    const/4 v0, 0x0

    .line 548
    iput v0, p0, Ll/ᩳۙܽ;->֡:I

    .line 552
    invoke-static {p1}, Ll/֨ۙܽ;->ۙ(Ll/֨ۙܽ;)Ll/᩷ۙܽ;

    move-result-object v1

    iput-object v1, p0, Ll/ᩳۙܽ;->ۢ:Ll/᩷ۙܽ;

    .line 553
    iput-boolean v0, p0, Ll/ᩳۙܽ;->۟:Z

    .line 554
    invoke-static {p1}, Ll/֨ۙܽ;->᩷(Ll/֨ۙܽ;)I

    move-result p1

    iput p1, p0, Ll/ᩳۙܽ;->ܿ:I

    .line 555
    iput-object p2, p0, Ll/ᩳۙܽ;->ᩳ:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public abstract ۤ(I)I
.end method

.method public abstract ᩷(I)I
.end method
