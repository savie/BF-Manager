.class public final Ll/᩶ۧ᩵;
.super Ljava/lang/Object;
.source "86EK"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ֡:I

.field public ۟:I

.field public final ܰ:Ljava/util/List;

.field public ܿ:I

.field public final ᩶:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ljava/util/BitSet;ILjava/util/List;)V
    .locals 0

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 178
    iput-object p1, p0, Ll/᩶ۧ᩵;->᩶:Ljava/util/BitSet;

    .line 179
    iput p2, p0, Ll/᩶ۧ᩵;->֡:I

    .line 180
    iput-object p3, p0, Ll/᩶ۧ᩵;->ܰ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 185
    iget v0, p0, Ll/᩶ۧ᩵;->ܿ:I

    iget v1, p0, Ll/᩶ۧ᩵;->֡:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 190
    iget-object v0, p0, Ll/᩶ۧ᩵;->᩶:Ljava/util/BitSet;

    iget v1, p0, Ll/᩶ۧ᩵;->۟:I

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 194
    iput v1, p0, Ll/᩶ۧ᩵;->۟:I

    .line 195
    iget v1, p0, Ll/᩶ۧ᩵;->ܿ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩶ۧ᩵;->ܿ:I

    .line 196
    iget-object v1, p0, Ll/᩶ۧ᩵;->ܰ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    return-object v0

    .line 192
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
