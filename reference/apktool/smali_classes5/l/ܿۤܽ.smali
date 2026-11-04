.class public Ll/ܿۤܽ;
.super Ll/᩶᩷ܽ;
.source "E3QI"


# instance fields
.field public volatile ֡:Ll/ۢۤܽ;

.field public final ܰ:I

.field public final ܿ:Ll/֫᩸ܽ;

.field public final ᩶:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILl/֫᩸ܽ;)V
    .locals 1

    .line 833
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 755
    sget-object v0, Ll/ۚ᩸ܽ;->᩻ۙ:Ll/᩺᩷ܽ;

    .line 986
    iput-object v0, p0, Ll/ܿۤܽ;->֡:Ll/ۢۤܽ;

    .line 972
    iput-object p1, p0, Ll/ܿۤܽ;->᩶:Ljava/lang/Object;

    .line 973
    iput p2, p0, Ll/ܿۤܽ;->ܰ:I

    .line 974
    iput-object p3, p0, Ll/ܿۤܽ;->ܿ:Ll/֫᩸ܽ;

    return-void
.end method


# virtual methods
.method public final getHash()I
    .locals 1

    .line 1000
    iget v0, p0, Ll/ܿۤܽ;->ܰ:I

    return v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 979
    iget-object v0, p0, Ll/ܿۤܽ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final getNext()Ll/֫᩸ܽ;
    .locals 1

    .line 1005
    iget-object v0, p0, Ll/ܿۤܽ;->ܿ:Ll/֫᩸ܽ;

    return-object v0
.end method

.method public final ۙ(Ll/ۢۤܽ;)V
    .locals 0

    .line 995
    iput-object p1, p0, Ll/ܿۤܽ;->֡:Ll/ۢۤܽ;

    return-void
.end method

.method public final ᩴ()Ll/ۢۤܽ;
    .locals 1

    .line 990
    iget-object v0, p0, Ll/ܿۤܽ;->֡:Ll/ۢۤܽ;

    return-object v0
.end method
