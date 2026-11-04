.class public final Ll/ܿܳܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public ֫:J

.field public final synthetic ۗ:Ll/֡ܳܳ;

.field public final ۙ:Ll/ۗᩴܳ;

.field public ۚ:Z

.field public final ۤ:Z

.field public final ۧ:I

.field public ۫:Z

.field public final ܳ:Ll/᩵۫ܳ;

.field public final ܶ:Ll/᩵ܳܳ;

.field public ܺ:I

.field public ܽ:J

.field public ᩴ:[I

.field public ᩷:I

.field public ᩸:I

.field public final ᩹:[B

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/֡ܳܳ;I[B)V
    .locals 2

    .line 4751
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    const/4 v0, -0x1

    .line 4742
    iput v0, p0, Ll/ܿܳܳ;->᩷:I

    .line 4744
    iput v0, p0, Ll/ܿܳܳ;->ܺ:I

    .line 4752
    iput p2, p0, Ll/ܿܳܳ;->ۧ:I

    .line 4753
    iput-object p3, p0, Ll/ܿܳܳ;->᩹:[B

    .line 4754
    array-length v0, p3

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/ܿܳܳ;->ۤ:Z

    .line 4755
    invoke-static {p1}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܳܳ;->ۙ()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Ll/ܿܳܳ;->ܽ:J

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 49
    array-length v1, p3

    if-eqz v1, :cond_1

    .line 52
    new-instance v1, Ll/᩵۫ܳ;

    invoke-direct {v1, p3}, Ll/᩵۫ܳ;-><init>([B)V

    .line 4757
    iput-object v1, p0, Ll/ܿܳܳ;->ܳ:Ll/᩵۫ܳ;

    const/16 p3, 0x100

    new-array p3, p3, [I

    .line 4758
    iput-object p3, p0, Ll/ܿܳܳ;->ᩴ:[I

    .line 4759
    iput-object v0, p0, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    .line 4760
    iput-object v0, p0, Ll/ܿܳܳ;->ܶ:Ll/᩵ܳܳ;

    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pattern replacement must not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4762
    :cond_2
    iput-object v0, p0, Ll/ܿܳܳ;->ܳ:Ll/᩵۫ܳ;

    .line 4763
    iput-object v0, p0, Ll/ܿܳܳ;->ᩴ:[I

    .line 4764
    new-instance p3, Ll/ۗᩴܳ;

    invoke-static {p1}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    invoke-direct {p3, v0}, Ll/ۗᩴܳ;-><init>(Ll/ܺᩴܳ;)V

    iput-object p3, p0, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    .line 4765
    new-instance p3, Ll/᩵ܳܳ;

    invoke-direct {p3}, Ll/᩵ܳܳ;-><init>()V

    iput-object p3, p0, Ll/ܿܳܳ;->ܶ:Ll/᩵ܳܳ;

    .line 4766
    invoke-static {p1}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object p3

    invoke-virtual {p3}, Ll/᩶ܳܳ;->ۙ()I

    move-result p3

    int-to-long v0, p3

    invoke-direct {p0, v0, v1}, Ll/ܿܳܳ;->ۙ(J)V

    :goto_1
    if-eqz p2, :cond_3

    goto :goto_3

    .line 4769
    :cond_3
    invoke-static {p1}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object p2

    iget-object p2, p2, Ll/᩶ܳܳ;->᩸:Ll/ܺᩴܳ;

    sget p3, Ll/ᩳܳܳ;->ܳۙ:I

    if-nez p2, :cond_4

    const-wide/16 p2, 0x0

    goto :goto_2

    .line 38
    :cond_4
    iget-wide p2, p2, Ll/ܺᩴܳ;->ۤ:J

    .line 4769
    :goto_2
    invoke-static {p1}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object p1

    .line 4770
    invoke-virtual {p1}, Ll/᩶ܳܳ;->ۙ()I

    move-result p1

    int-to-long v0, p1

    .line 4769
    invoke-direct {p0, p2, p3, v0, v1}, Ll/ܿܳܳ;->ۙ(JJ)J

    :goto_3
    return-void
.end method

.method private ۙ(JJ)J
    .locals 7

    .line 5060
    iget-object v0, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v0}, Ll/֡ܳܳ;->᩹(Ll/֡ܳܳ;)J

    move-result-wide v1

    iget-object v3, p0, Ll/ܿܳܳ;->᩹:[B

    array-length v3, v3

    int-to-long v3, v3

    const-wide/16 v5, 0x58

    .line 5061
    invoke-static {v3, v4, v5, v6}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v3

    .line 5060
    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5063
    iget-object v3, p0, Ll/ܿܳܳ;->ܶ:Ll/᩵ܳܳ;

    invoke-virtual {v3}, Ll/᩵ܳܳ;->ۙ()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5064
    invoke-static {v0}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v3

    iget-object v3, v3, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    invoke-static {v3}, Ll/ᩴۚܳ;->ܽ(Ll/۬۫ܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5065
    invoke-static {v0}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v3

    iget-object v3, v3, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    invoke-static {v3}, Ll/ᩴۚܳ;->ܳ(Ll/۬۫ܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 5066
    invoke-static {v0}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    invoke-static {v0}, Ll/ᩴۚܳ;->۫(Ll/۬۫ܳ;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v0

    .line 5067
    invoke-static {v0, v1, p1, p2}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide p1

    .line 5068
    invoke-static {p3, p4}, Ll/᩵ᩴܳ;->ۙ(J)J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method private ۙ()V
    .locals 11

    .line 4927
    iget v0, p0, Ll/ܿܳܳ;->᩸:I

    if-nez v0, :cond_0

    return-void

    .line 4930
    :cond_0
    iget-object v0, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v0}, Ll/֡ܳܳ;->᩵(Ll/֡ܳܳ;)Ll/۬۫ܳ;

    move-result-object v1

    iget-object v2, p0, Ll/ܿܳܳ;->ᩴ:[I

    iget v3, p0, Ll/ܿܳܳ;->᩸:I

    iget v4, p0, Ll/ܿܳܳ;->ۧ:I

    invoke-static {v1, v2, v3, v4}, Ll/ᩴۚܳ;->ۙ(Ll/۬۫ܳ;[III)J

    move-result-wide v1

    .line 4932
    invoke-static {v0}, Ll/֡ܳܳ;->᩵(Ll/֡ܳܳ;)Ll/۬۫ܳ;

    move-result-object v3

    invoke-static {v3}, Ll/ᩴۚܳ;->ܳ(Ll/۬۫ܳ;)J

    move-result-wide v5

    invoke-static {v0}, Ll/֡ܳܳ;->ܶ(Ll/֡ܳܳ;)J

    move-result-wide v7

    invoke-static {v0}, Ll/֡ܳܳ;->᩹(Ll/֡ܳܳ;)J

    move-result-wide v9

    .line 4933
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v7

    .line 4932
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 4934
    invoke-static {v0}, Ll/֡ܳܳ;->᩵(Ll/֡ܳܳ;)Ll/۬۫ܳ;

    move-result-object v3

    .line 4935
    invoke-static {v3}, Ll/ᩴۚܳ;->ܽ(Ll/۬۫ܳ;)J

    move-result-wide v7

    .line 4934
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 4936
    invoke-static {v0}, Ll/֡ܳܳ;->ܳ(Ll/֡ܳܳ;)Ll/ܺᩴܳ;

    move-result-object v3

    invoke-static {v3}, Ll/᩵ᩴܳ;->ܳ(Ll/ܺᩴܳ;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    const-wide/16 v7, 0x3c0

    mul-long v1, v1, v7

    .line 4937
    invoke-static {v0}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v3

    .line 4940
    invoke-virtual {v3}, Ll/᩶ܳܳ;->ۙ()I

    move-result v3

    iget-object v7, p0, Ll/ܿܳܳ;->ᩴ:[I

    iget v8, p0, Ll/ܿܳܳ;->᩸:I

    invoke-static {v3, v8, v4, v7}, Ll/ᩳܳܳ;->ۙ(III[I)J

    move-result-wide v7

    invoke-static {v0}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v3

    .line 4943
    invoke-virtual {v3}, Ll/᩶ܳܳ;->ۙ()I

    move-result v3

    iget-object v9, p0, Ll/ܿܳܳ;->ᩴ:[I

    iget v10, p0, Ll/ܿܳܳ;->᩸:I

    invoke-static {v3, v10, v4, v9}, Ll/ᩳܳܳ;->᩷(III[I)J

    move-result-wide v9

    .line 4939
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v7

    .line 4938
    invoke-static {v1, v2, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 4937
    invoke-static {v5, v6, v1, v2}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 4946
    iget-boolean v3, p0, Ll/ܿܳܳ;->۫:Z

    iget-object v5, p0, Ll/ܿܳܳ;->ܳ:Ll/᩵۫ܳ;

    if-nez v3, :cond_1

    .line 4947
    invoke-virtual {v5}, Ll/᩵۫ܳ;->ۤ()J

    move-result-wide v6

    invoke-static {v1, v2, v6, v7}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    .line 4949
    :cond_1
    invoke-static {v1, v2}, Ll/ᩳܳܳ;->᩷(J)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4952
    invoke-static {v0}, Ll/֡ܳܳ;->᩵(Ll/֡ܳܳ;)Ll/۬۫ܳ;

    move-result-object v1

    iget-object v2, p0, Ll/ܿܳܳ;->ᩴ:[I

    iget v3, p0, Ll/ܿܳܳ;->᩸:I

    invoke-static {v1, v2, v3, v4, v5}, Ll/ᩴۚܳ;->ۙ(Ll/۬۫ܳ;[IIILl/᩵۫ܳ;)Ll/۬۫ܳ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;Ll/۬۫ܳ;)V

    .line 4954
    iget-boolean v1, p0, Ll/ܿܳܳ;->۫:Z

    if-nez v1, :cond_2

    .line 4955
    invoke-static {v0}, Ll/֡ܳܳ;->ܶ(Ll/֡ܳܳ;)J

    move-result-wide v1

    invoke-virtual {v5}, Ll/᩵۫ܳ;->ۤ()J

    move-result-wide v5

    invoke-static {v1, v2, v5, v6}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Ll/֡ܳܳ;->᩸(Ll/֡ܳܳ;J)V

    const/4 v1, 0x1

    .line 4956
    iput-boolean v1, p0, Ll/ܿܳܳ;->۫:Z

    .line 4958
    :cond_2
    invoke-static {v0}, Ll/֡ܳܳ;->ܳ(Ll/֡ܳܳ;)Ll/ܺᩴܳ;

    move-result-object v1

    iget-object v2, p0, Ll/ܿܳܳ;->ᩴ:[I

    iget v3, p0, Ll/ܿܳܳ;->᩸:I

    invoke-static {v1, v2, v3, v4}, Ll/᩵ᩴܳ;->ۙ(Ll/ܺᩴܳ;[III)Ll/ܺᩴܳ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;Ll/ܺᩴܳ;)V

    .line 4960
    invoke-static {v0}, Ll/֡ܳܳ;->֡(Ll/֡ܳܳ;)V

    const/4 v0, 0x0

    .line 4961
    iput v0, p0, Ll/ܿܳܳ;->᩸:I

    return-void

    .line 4950
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Edit metadata exceeds memory limit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۙ(I)V
    .locals 14

    .line 4966
    iget-boolean v0, p0, Ll/ܿܳܳ;->ۤ:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 4967
    invoke-direct {p0, p1, v1}, Ll/ܿܳܳ;->ۙ(II)V

    return-void

    :cond_0
    int-to-long v2, p1

    .line 4970
    iget v0, p0, Ll/ܿܳܳ;->ۧ:I

    int-to-long v4, v0

    add-long v6, v2, v4

    if-ltz p1, :cond_4

    .line 4971
    iget v8, p0, Ll/ܿܳܳ;->ܺ:I

    if-lt p1, v8, :cond_4

    iget-object v8, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v8}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v9

    .line 4972
    invoke-virtual {v9}, Ll/᩶ܳܳ;->ۙ()I

    move-result v9

    int-to-long v9, v9

    cmp-long v11, v6, v9

    if-gtz v11, :cond_4

    .line 4976
    iget-wide v9, p0, Ll/ܿܳܳ;->ܽ:J

    iget-object v11, p0, Ll/ܿܳܳ;->᩹:[B

    array-length v12, v11

    int-to-long v12, v12

    add-long/2addr v9, v12

    sub-long/2addr v9, v4

    const-wide/32 v4, 0x7fffffff

    cmp-long v12, v9, v4

    if-gtz v12, :cond_3

    ushr-int/lit8 v4, p1, 0x10

    .line 4983
    iget v5, p0, Ll/ܿܳܳ;->᩸:I

    if-eqz v5, :cond_1

    iget v5, p0, Ll/ܿܳܳ;->᩷:I

    if-eq v4, v5, :cond_1

    .line 4984
    invoke-direct {p0}, Ll/ܿܳܳ;->ۙ()V

    .line 4986
    :cond_1
    iput v4, p0, Ll/ܿܳܳ;->᩷:I

    .line 4987
    iget v4, p0, Ll/ܿܳܳ;->᩸:I

    add-int/2addr v4, v1

    .line 5033
    iget-object v5, p0, Ll/ܿܳܳ;->ᩴ:[I

    array-length v12, v5

    if-gt v4, v12, :cond_2

    goto :goto_0

    .line 5036
    :cond_2
    array-length v5, v5

    shl-int/2addr v5, v1

    .line 5037
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/high16 v5, 0x10000

    .line 5036
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 5038
    iget-object v5, p0, Ll/ܿܳܳ;->ᩴ:[I

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v4

    iput-object v4, p0, Ll/ܿܳܳ;->ᩴ:[I

    .line 4988
    :goto_0
    iget-object v4, p0, Ll/ܿܳܳ;->ᩴ:[I

    iget v5, p0, Ll/ܿܳܳ;->᩸:I

    add-int/lit8 v12, v5, 0x1

    iput v12, p0, Ll/ܿܳܳ;->᩸:I

    aput p1, v4, v5

    .line 4989
    invoke-static {v8}, Ll/֡ܳܳ;->᩸(Ll/֡ܳܳ;)Ll/᩺ᩴܳ;

    move-result-object p1

    iget-wide v4, p0, Ll/ܿܳܳ;->ܽ:J

    add-long/2addr v2, v4

    invoke-static {v8}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩶ܳܳ;->ۙ()I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    long-to-int v3, v2

    array-length v2, v11

    .line 76
    invoke-virtual {p1, v3, v0, v2, v1}, Ll/᩺ᩴܳ;->ۙ(IIII)V

    .line 4990
    iput-wide v9, p0, Ll/ܿܳܳ;->ܽ:J

    long-to-int p1, v6

    .line 4991
    iput p1, p0, Ll/ܿܳܳ;->ܺ:I

    .line 4992
    iget-wide v0, p0, Ll/ܿܳܳ;->֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܿܳܳ;->֫:J

    return-void

    .line 4979
    :cond_3
    new-instance p1, Ll/ۨᩴܳ;

    invoke-direct {p1}, Ll/ۨᩴܳ;-><init>()V

    throw p1

    .line 4973
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid batch match offset "

    .line 0
    invoke-static {p1, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4973
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۙ(II)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    if-lez v2, :cond_6

    .line 5000
    iget v3, v0, Ll/ܿܳܳ;->ۧ:I

    int-to-long v4, v3

    int-to-long v6, v2

    mul-long v4, v4, v6

    int-to-long v8, v1

    add-long v10, v8, v4

    if-ltz v1, :cond_5

    .line 5002
    iget v12, v0, Ll/ܿܳܳ;->ܺ:I

    if-lt v1, v12, :cond_5

    iget-object v12, v0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v12}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v13

    .line 5003
    invoke-virtual {v13}, Ll/᩶ܳܳ;->ۙ()I

    move-result v13

    int-to-long v13, v13

    cmp-long v15, v10, v13

    if-gtz v15, :cond_5

    .line 5007
    iget-object v13, v0, Ll/ܿܳܳ;->᩹:[B

    array-length v14, v13

    int-to-long v14, v14

    mul-long v14, v14, v6

    move-wide/from16 v16, v6

    .line 5008
    iget-wide v6, v0, Ll/ܿܳܳ;->ܽ:J

    add-long/2addr v6, v14

    sub-long/2addr v6, v4

    const-wide/32 v18, 0x7fffffff

    cmp-long v20, v6, v18

    if-gtz v20, :cond_4

    move-wide/from16 v18, v10

    .line 5012
    iget-object v10, v0, Ll/ܿܳܳ;->ܶ:Ll/᩵ܳܳ;

    invoke-virtual {v10, v1, v3, v2}, Ll/᩵ܳܳ;->ۙ(III)V

    .line 5013
    invoke-direct {v0, v6, v7}, Ll/ܿܳܳ;->ۙ(J)V

    .line 5014
    iget-object v10, v0, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    invoke-virtual {v10}, Ll/ۗᩴܳ;->ۤ()I

    move-result v11

    if-ge v11, v1, :cond_1

    .line 5043
    iget v11, v0, Ll/ܿܳܳ;->᩻:I

    if-eqz v11, :cond_0

    .line 5044
    invoke-virtual {v10, v11}, Ll/ۗᩴܳ;->ۙ(I)V

    const/4 v11, 0x0

    .line 5045
    iput v11, v0, Ll/ܿܳܳ;->᩻:I

    .line 5016
    :cond_0
    invoke-virtual {v10, v1}, Ll/ۗᩴܳ;->᩷(I)V

    :cond_1
    long-to-int v1, v4

    .line 5018
    invoke-virtual {v10, v1}, Ll/ۗᩴܳ;->ۤ(I)V

    .line 5019
    iget v1, v0, Ll/ܿܳܳ;->᩻:I

    long-to-int v4, v14

    int-to-long v14, v1

    int-to-long v4, v4

    add-long/2addr v14, v4

    long-to-int v1, v14

    int-to-long v4, v1

    cmp-long v11, v14, v4

    if-nez v11, :cond_3

    iput v1, v0, Ll/ܿܳܳ;->᩻:I

    .line 5022
    invoke-virtual {v10}, Ll/ۗᩴܳ;->᩷()J

    move-result-wide v4

    .line 5021
    invoke-direct {v0, v4, v5, v6, v7}, Ll/ܿܳܳ;->ۙ(JJ)J

    move-result-wide v4

    .line 5051
    invoke-static {v4, v5}, Ll/ᩳܳܳ;->᩷(J)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5024
    invoke-static {v12}, Ll/֡ܳܳ;->᩸(Ll/֡ܳܳ;)Ll/᩺ᩴܳ;

    move-result-object v1

    iget-wide v4, v0, Ll/ܿܳܳ;->ܽ:J

    add-long/2addr v8, v4

    invoke-static {v12}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩶ܳܳ;->ۙ()I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v8, v4

    long-to-int v4, v8

    array-length v5, v13

    invoke-virtual {v1, v4, v3, v5, v2}, Ll/᩺ᩴܳ;->ۙ(IIII)V

    .line 5026
    iput-wide v6, v0, Ll/ܿܳܳ;->ܽ:J

    move-wide/from16 v8, v18

    long-to-int v1, v8

    .line 5027
    iput v1, v0, Ll/ܿܳܳ;->ܺ:I

    .line 5028
    iget-wide v1, v0, Ll/ܿܳܳ;->֫:J

    add-long v1, v1, v16

    iput-wide v1, v0, Ll/ܿܳܳ;->֫:J

    return-void

    .line 5052
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Replacement edit metadata exceeds memory limit"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 0
    :cond_3
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 5010
    :cond_4
    new-instance v1, Ll/ۨᩴܳ;

    invoke-direct {v1}, Ll/ۨᩴܳ;-><init>()V

    throw v1

    .line 5004
    :cond_5
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "Invalid batch match run "

    .line 0
    invoke-static {v1, v3}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5004
    invoke-direct {v2, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 4998
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Empty replacement run"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private ۙ(J)V
    .locals 15

    move-object v0, p0

    .line 5073
    iget-object v1, v0, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    if-nez v1, :cond_0

    return-void

    .line 5076
    :cond_0
    iget-object v2, v0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->᩹(Ll/֡ܳܳ;)J

    move-result-wide v3

    iget-object v5, v0, Ll/ܿܳܳ;->᩹:[B

    array-length v5, v5

    int-to-long v5, v5

    const-wide/16 v7, 0x58

    .line 5077
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    iget-object v7, v0, Ll/ܿܳܳ;->ܶ:Ll/᩵ܳܳ;

    .line 5079
    invoke-virtual {v7}, Ll/᩵ܳܳ;->ۙ()J

    move-result-wide v7

    invoke-static {v2}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v9

    iget-object v9, v9, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 5081
    invoke-static {v9}, Ll/ᩴۚܳ;->ܽ(Ll/۬۫ܳ;)J

    move-result-wide v9

    invoke-static {v2}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v11

    iget-object v11, v11, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 5083
    invoke-static {v11}, Ll/ᩴۚܳ;->ܳ(Ll/۬۫ܳ;)J

    move-result-wide v11

    invoke-static {v2}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v2

    iget-object v2, v2, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 5084
    invoke-static {v2}, Ll/ᩴۚܳ;->۫(Ll/۬۫ܳ;)J

    move-result-wide v13

    .line 5082
    invoke-static {v11, v12, v13, v14}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v11

    .line 5080
    invoke-static {v9, v10, v11, v12}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v9

    .line 5079
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v7

    .line 5077
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 5076
    invoke-static {v3, v4, v5, v6}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v2

    .line 5087
    invoke-static/range {p1 .. p2}, Ll/᩵ᩴܳ;->ۙ(J)J

    move-result-wide v4

    .line 5086
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v2

    const-wide/16 v4, 0x2050

    .line 5088
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v2

    const-wide/32 v4, 0x4000000

    sub-long/2addr v4, v2

    const-wide/16 v2, 0x0

    .line 5091
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ۗᩴܳ;->ۙ(J)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܿܳܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ܿܳܳ;->ۚ:Z

    return-void
.end method


# virtual methods
.method public final ۙ(I[I)V
    .locals 10

    const-string v0, "originalOffsets"

    .line 4794
    invoke-static {p2, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4795
    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Ll/۬ܳܳ;->ۙ(III)V

    .line 4796
    iget-object v0, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v0}, Ll/֡ܳܳ;->ܽ(Ll/֡ܳܳ;)Ll/ᩳܳܳ;

    move-result-object v0

    monitor-enter v0

    .line 5096
    :try_start_0
    iget-object v2, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ܿ(Ll/֡ܳܳ;)V

    .line 5097
    iget-boolean v3, p0, Ll/ܿܳܳ;->ۚ:Z

    if-nez v3, :cond_3

    invoke-static {v2}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;)Ll/ܿܳܳ;

    move-result-object v2

    if-ne v2, p0, :cond_3

    .line 4800
    iget-boolean v2, p0, Ll/ܿܳܳ;->ۤ:Z

    if-eqz v2, :cond_0

    :goto_0
    if-ge v1, p1, :cond_2

    .line 4802
    aget v2, p2, v1

    invoke-direct {p0, v2}, Ll/ܿܳܳ;->ۙ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v1, p1, :cond_2

    .line 4807
    aget v2, p2, v1

    const/4 v3, 0x1

    :goto_2
    add-int v4, v1, v3

    if-ge v4, p1, :cond_1

    add-int/lit8 v5, v4, -0x1

    .line 4809
    aget v5, p2, v5

    int-to-long v5, v5

    iget v7, p0, Ll/ܿܳܳ;->ۧ:I

    int-to-long v7, v7

    add-long/2addr v5, v7

    aget v7, p2, v4

    int-to-long v7, v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 4815
    :cond_1
    invoke-direct {p0, v2, v3}, Ll/ܿܳܳ;->ۙ(II)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v4

    goto :goto_1

    .line 4825
    :cond_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 5098
    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Batch replacement is not active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 4820
    :goto_3
    :try_start_3
    iget-object p2, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {p2}, Ll/֡ܳܳ;->֫(Ll/֡ܳܳ;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 4821
    iget-object p2, p0, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {p2}, Ll/֡ܳܳ;->᩶(Ll/֡ܳܳ;)V

    .line 4823
    :cond_4
    throw p1

    .line 4825
    :goto_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/۟֡֫;)V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move-object v3, v2

    goto :goto_0

    .line 4835
    :cond_0
    invoke-static/range {p1 .. p1}, Ll/ܿ֡֫;->ۙ(Ll/۟֡֫;)Ll/۟֡֫;

    move-result-object v3

    .line 4836
    :goto_0
    iget-object v4, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v4}, Ll/֡ܳܳ;->ܽ(Ll/֡ܳܳ;)Ll/ᩳܳܳ;

    move-result-object v4

    move-object/from16 v16, v4

    monitor-enter v16

    .line 5096
    :try_start_0
    iget-object v4, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v4}, Ll/֡ܳܳ;->ܿ(Ll/֡ܳܳ;)V

    .line 5097
    iget-boolean v5, v1, Ll/ܿܳܳ;->ۚ:Z

    if-nez v5, :cond_d

    invoke-static {v4}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;)Ll/ܿܳܳ;

    move-result-object v4

    if-ne v4, v1, :cond_d

    if-eqz v3, :cond_1

    .line 4840
    iget-object v4, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v4, v3}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;Ll/۟֡֫;)V

    .line 4842
    :cond_1
    iget-wide v4, v1, Ll/ܿܳܳ;->֫:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_c

    .line 4843
    iget-boolean v4, v1, Ll/ܿܳܳ;->ۤ:Z

    if-eqz v4, :cond_2

    .line 4844
    invoke-direct/range {p0 .. p0}, Ll/ܿܳܳ;->ۙ()V

    goto/16 :goto_4

    .line 5043
    :cond_2
    iget v4, v1, Ll/ܿܳܳ;->᩻:I

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 5044
    iget-object v8, v1, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    invoke-virtual {v8, v4}, Ll/ۗᩴܳ;->ۙ(I)V

    .line 5045
    iput v5, v1, Ll/ܿܳܳ;->᩻:I

    .line 4847
    :cond_3
    iget-object v4, v1, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    iget-object v5, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v5}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩶ܳܳ;->ۙ()I

    move-result v5

    invoke-virtual {v4, v5, v3}, Ll/ۗᩴܳ;->ۙ(ILl/۟֡֫;)V

    .line 4848
    iget-object v4, v1, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    .line 4849
    invoke-virtual {v4}, Ll/ۗᩴܳ;->᩷()J

    move-result-wide v4

    iget-wide v8, v1, Ll/ܿܳܳ;->ܽ:J

    .line 4848
    invoke-direct {v1, v4, v5, v8, v9}, Ll/ܿܳܳ;->ۙ(JJ)J

    move-result-wide v4

    .line 5051
    invoke-static {v4, v5}, Ll/ᩳܳܳ;->᩷(J)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 4851
    iget-object v4, v1, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    invoke-virtual {v4}, Ll/ۗᩴܳ;->ۙ()Ll/ܺᩴܳ;

    move-result-object v4

    .line 4853
    iget-wide v8, v1, Ll/ܿܳܳ;->ܽ:J

    cmp-long v5, v8, v6

    if-eqz v5, :cond_5

    .line 4854
    iget-object v2, v1, Ll/ܿܳܳ;->ܶ:Ll/᩵ܳܳ;

    invoke-virtual {v2, v3}, Ll/᩵ܳܳ;->ۙ(Ll/۟֡֫;)Ll/ۗܳܳ;

    move-result-object v11

    .line 4856
    iget-object v2, v1, Ll/ܿܳܳ;->᩹:[B

    array-length v2, v2

    int-to-long v5, v2

    .line 4857
    invoke-virtual {v11}, Ll/ۗܳܳ;->ۙ()J

    move-result-wide v7

    const-wide/16 v9, 0x58

    invoke-static {v7, v8, v9, v10}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v7

    .line 4856
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 4859
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->᩹(Ll/֡ܳܳ;)J

    move-result-wide v7

    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v2

    iget-object v2, v2, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 4862
    invoke-static {v2}, Ll/ᩴۚܳ;->ܽ(Ll/۬۫ܳ;)J

    move-result-wide v9

    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v2

    iget-object v2, v2, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 4865
    invoke-static {v2}, Ll/ᩴۚܳ;->ܳ(Ll/۬۫ܳ;)J

    move-result-wide v12

    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v2

    iget-object v2, v2, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    .line 4867
    invoke-static {v2}, Ll/ᩴۚܳ;->۫(Ll/۬۫ܳ;)J

    move-result-wide v14

    .line 4864
    invoke-static {v12, v13, v14, v15}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v12

    .line 4861
    invoke-static {v9, v10, v12, v13}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v9

    .line 4860
    invoke-static {v7, v8, v9, v10}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v7

    .line 4859
    invoke-static {v5, v6, v7, v8}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 4869
    iget-object v2, v1, Ll/ܿܳܳ;->ۙ:Ll/ۗᩴܳ;

    .line 4870
    invoke-virtual {v2}, Ll/ۗᩴܳ;->᩷()J

    move-result-wide v7

    const-wide/16 v9, 0x1

    .line 4873
    invoke-static {v9, v10}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v9

    .line 4871
    invoke-static {v5, v6, v9, v10}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 4869
    invoke-static {v7, v8, v5, v6}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v5

    .line 5051
    invoke-static {v5, v6}, Ll/ᩳܳܳ;->᩷(J)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 4875
    new-instance v2, Ll/ۛܳܳ;

    iget-object v5, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v5}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v5

    iget-object v6, v5, Ll/᩶ܳܳ;->ܺ:Ll/۬۫ܳ;

    iget-object v5, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v5}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;)Ll/᩶ܳܳ;

    move-result-object v5

    .line 4876
    invoke-virtual {v5}, Ll/᩶ܳܳ;->ۙ()I

    move-result v7

    iget-wide v8, v1, Ll/ܿܳܳ;->ܽ:J

    long-to-int v8, v8

    iget v9, v1, Ll/ܿܳܳ;->ۧ:I

    iget-object v10, v1, Ll/ܿܳܳ;->᩹:[B

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Ll/ۛܳܳ;-><init>(Ll/۬۫ܳ;III[BLl/ۗܳܳ;)V

    .line 4878
    iget-object v5, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    const/4 v6, 0x1

    new-array v6, v6, [Ll/᩸۫ܳ;

    const/4 v7, 0x0

    aput-object v2, v6, v7

    invoke-static {v5, v6}, Ll/֡ܳܳ;->᩷(Ll/֡ܳܳ;[Ll/᩸۫ܳ;)V

    .line 4879
    invoke-static {v2}, Ll/ᩴۚܳ;->ۙ(Ll/᩸۫ܳ;)Ll/۬۫ܳ;

    move-result-object v5

    .line 4880
    iget-object v6, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/ۛܳܳ;->ᩴ(Ll/ۛܳܳ;)J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Ll/֡ܳܳ;->ᩴ(Ll/֡ܳܳ;J)V

    .line 4881
    iget-object v6, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-virtual {v2}, Ll/ۛܳܳ;->ᩴ()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Ll/֡ܳܳ;->᩷(Ll/֡ܳܳ;J)V

    move-object v2, v5

    goto :goto_1

    .line 5052
    :cond_4
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Replacement edit metadata exceeds memory limit"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_1
    if-nez v2, :cond_6

    const/4 v5, 0x0

    goto :goto_2

    .line 45
    :cond_6
    iget v5, v2, Ll/۬۫ܳ;->۫:I

    :goto_2
    int-to-long v5, v5

    .line 4883
    iget-wide v7, v1, Ll/ܿܳܳ;->ܽ:J

    cmp-long v9, v5, v7

    if-nez v9, :cond_a

    if-nez v4, :cond_7

    const/4 v5, 0x0

    goto :goto_3

    .line 29
    :cond_7
    iget v5, v4, Ll/ܺᩴܳ;->ܳ:I

    :goto_3
    int-to-long v5, v5

    cmp-long v9, v5, v7

    if-nez v9, :cond_a

    .line 4888
    iget-object v5, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v5, v2}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;Ll/۬۫ܳ;)V

    .line 4889
    iget-object v5, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v5, v4}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;Ll/ܺᩴܳ;)V

    .line 4891
    invoke-static {v2}, Ll/ᩴۚܳ;->ܺ(Ll/۬۫ܳ;)Ll/ۤۚܳ;

    move-result-object v2

    .line 4892
    iget-object v4, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-virtual {v2}, Ll/ۤۚܳ;->ۙ()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;J)V

    .line 4893
    iget-object v4, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-virtual {v2}, Ll/ۤۚܳ;->᩷()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Ll/֡ܳܳ;->ۤ(Ll/֡ܳܳ;J)V

    .line 4894
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ᩴ(Ll/֡ܳܳ;)J

    move-result-wide v4

    const-wide/32 v6, 0x800000

    cmp-long v2, v4, v6

    if-gtz v2, :cond_9

    .line 4898
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    const-wide/16 v4, 0x0

    invoke-static {v2, v4, v5}, Ll/֡ܳܳ;->᩸(Ll/֡ܳܳ;J)V

    .line 4899
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->֡(Ll/֡ܳܳ;)V

    :goto_4
    if-eqz v3, :cond_8

    .line 4902
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2, v3}, Ll/֡ܳܳ;->ۙ(Ll/֡ܳܳ;Ll/۟֡֫;)V

    .line 4904
    :cond_8
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ۘ(Ll/֡ܳܳ;)V

    .line 4905
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ܰ(Ll/֡ܳܳ;)V

    goto :goto_5

    .line 4895
    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Literal heap storage exceeds memory limit"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 4885
    :cond_a
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Batch replacement length mismatch"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 5052
    :cond_b
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Replacement edit metadata exceeds memory limit"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_c
    :goto_5
    const/4 v2, 0x1

    .line 4907
    iput-boolean v2, v1, Ll/ܿܳܳ;->ۚ:Z

    .line 4908
    iget-object v2, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v2}, Ll/֡ܳܳ;->ۛ(Ll/֡ܳܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4915
    :try_start_1
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 5098
    :cond_d
    :try_start_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Batch replacement is not active"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_8

    :catch_0
    move-exception v0

    :goto_6
    move-object v2, v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_6

    .line 4910
    :goto_7
    :try_start_3
    iget-object v3, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v3}, Ll/֡ܳܳ;->֫(Ll/֡ܳܳ;)Z

    move-result v3

    if-nez v3, :cond_e

    .line 4911
    iget-object v3, v1, Ll/ܿܳܳ;->ۗ:Ll/֡ܳܳ;

    invoke-static {v3}, Ll/֡ܳܳ;->᩶(Ll/֡ܳܳ;)V

    .line 4913
    :cond_e
    throw v2

    .line 4915
    :goto_8
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v2
.end method
