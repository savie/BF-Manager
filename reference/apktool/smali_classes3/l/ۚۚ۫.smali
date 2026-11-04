.class public final Ll/ۚۚ۫;
.super Ll/۠ܳ᩸;
.source "A1YB"


# instance fields
.field public ֡:Ll/֫ܳ᩸;

.field public final synthetic ֨:Lnet/sf/sevenzipjbinding/IInArchive;

.field public final synthetic ۖ:[Ljava/lang/String;

.field public final synthetic ۙۙ:Z

.field public final synthetic ۜ:Ll/ۗܳ۫;

.field public ۟:Ll/᩷ۨᩴ;

.field public final synthetic ۠:Ll/᩷ۨᩴ;

.field public final synthetic ۡ:Ljava/util/ArrayList;

.field public final synthetic ۢ:Ll/᩻ۚ۫;

.field public final synthetic ۤۙ:[Ll/֫ۚ۫;

.field public final synthetic ۬:Ll/᩷ۨᩴ;

.field public ܿ:Z

.field public ᩳ:I

.field public ᩶:I

.field public final synthetic ᩷ۙ:I


# direct methods
.method public constructor <init>(Ll/᩻ۚ۫;Ll/᩻ۚ۫;Lnet/sf/sevenzipjbinding/IInArchive;Ll/᩷ۨᩴ;Ljava/util/ArrayList;[Ll/֫ۚ۫;[Ljava/lang/String;Ll/᩷ۨᩴ;ZLl/ۗܳ۫;I)V
    .locals 0

    .line 725
    iput-object p1, p0, Ll/ۚۚ۫;->ۢ:Ll/᩻ۚ۫;

    iput-object p3, p0, Ll/ۚۚ۫;->֨:Lnet/sf/sevenzipjbinding/IInArchive;

    iput-object p4, p0, Ll/ۚۚ۫;->۬:Ll/᩷ۨᩴ;

    iput-object p5, p0, Ll/ۚۚ۫;->ۡ:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/ۚۚ۫;->ۤۙ:[Ll/֫ۚ۫;

    iput-object p7, p0, Ll/ۚۚ۫;->ۖ:[Ljava/lang/String;

    iput-object p8, p0, Ll/ۚۚ۫;->۠:Ll/᩷ۨᩴ;

    iput-boolean p9, p0, Ll/ۚۚ۫;->ۙۙ:Z

    iput-object p10, p0, Ll/ۚۚ۫;->ۜ:Ll/ۗܳ۫;

    iput p11, p0, Ll/ۚۚ۫;->᩷ۙ:I

    invoke-direct {p0, p2}, Ll/۠ܳ᩸;-><init>(Ll/᩻ۚ۫;)V

    .line 726
    invoke-interface {p3}, Lnet/sf/sevenzipjbinding/IInArchive;->getNumberOfItems()I

    move-result p1

    iput p1, p0, Ll/ۚۚ۫;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֨()V
    .locals 1

    .line 832
    iget-object v0, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۢ()Z

    return-void
.end method

.method public final ֫(I)V
    .locals 10

    const/4 v0, 0x0

    .line 780
    iput-boolean v0, p0, Ll/ۚۚ۫;->ܿ:Z

    .line 781
    iget-object v8, p0, Ll/ۚۚ۫;->ۢ:Ll/᩻ۚ۫;

    iput-boolean v0, v8, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 782
    iget v0, p0, Ll/ۚۚ۫;->᩶:I

    const/4 v9, 0x1

    add-int/2addr v0, v9

    iput v0, p0, Ll/ۚۚ۫;->᩶:I

    .line 783
    iget-object v0, p0, Ll/ۚۚ۫;->֨:Lnet/sf/sevenzipjbinding/IInArchive;

    invoke-static {v0, p1}, Ll/֫ܳ᩸;->ۙ(Lnet/sf/sevenzipjbinding/IInArchive;I)Ll/֫ܳ᩸;

    move-result-object v0

    .line 784
    iget-object v1, p0, Ll/ۚۚ۫;->ۖ:[Ljava/lang/String;

    aget-object v3, v1, p1

    .line 785
    iget-boolean v1, v8, Ll/᩻ۚ۫;->ܰۙ:Z

    if-eqz v1, :cond_0

    .line 786
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f12037c

    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚۚ۫;->᩶:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚۚ۫;->ᩳ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ll/ᩳۜۧ;->ۘ(Ljava/lang/String;)V

    .line 788
    :cond_0
    invoke-virtual {v8, v3}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 789
    iget-object v1, p0, Ll/ۚۚ۫;->ۤۙ:[Ll/֫ۚ۫;

    aget-object p1, v1, p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 792
    :cond_1
    iget-object p1, p0, Ll/ۚۚ۫;->۠:Ll/᩷ۨᩴ;

    invoke-virtual {p1, v3}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 794
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 796
    invoke-virtual {v0}, Ll/֫ܳ᩸;->ۚ()J

    move-result-wide v4

    invoke-virtual {v0}, Ll/֫ܳ᩸;->֫()J

    move-result-wide v6

    move-object v1, v8

    move-object v2, p1

    .line 795
    invoke-static/range {v1 .. v7}, Ll/᩻ۚ۫;->ۙ(Ll/᩻ۚ۫;Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual {v8}, Ll/ᩳۜۧ;->۫()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_5

    if-eq v1, v9, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    goto :goto_1

    .line 1147
    :cond_3
    invoke-virtual {p1, v9}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object p1

    goto :goto_1

    :cond_4
    :goto_0
    return-void

    .line 802
    :cond_5
    iput-boolean v9, v8, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 803
    iget-object v1, v8, Ll/᩻ۚ۫;->ۛۙ:Ll/᩺᩵ᩴ;

    invoke-virtual {v1, p1}, Ll/᩺᩵ᩴ;->᩷(Ll/᩷ۨᩴ;)V

    .line 804
    iget-object v1, v8, Ll/᩻ۚ۫;->ܶۙ:Ll/ܿ᩸۫;

    invoke-virtual {v1}, Ll/ܿ᩸۫;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۨ᩷()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 805
    invoke-virtual {p1, p0}, Ll/᩷ۨᩴ;->᩷(Ll/۟֡֫;)Z

    .line 816
    :cond_6
    :goto_1
    iput-object p1, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    .line 817
    iput-object v0, p0, Ll/ۚۚ۫;->֡:Ll/֫ܳ᩸;

    .line 818
    iput-boolean v9, p0, Ll/ۚۚ۫;->ܿ:Z

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 760
    iget-object v0, p0, Ll/ۚۚ۫;->ۢ:Ll/᩻ۚ۫;

    iput-object p1, v0, Ll/᩻ۚ۫;->ۗۙ:Ljava/lang/String;

    .line 552
    invoke-virtual {p0}, Ll/ۚۚ۫;->ۚ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩶ۘܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    .line 734
    iget-object v0, p0, Ll/ۚۚ۫;->۬:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܰ()Ljava/lang/String;
    .locals 2

    .line 548
    invoke-virtual {p0}, Ll/ۚۚ۫;->ۚ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۘܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 751
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 754
    :cond_0
    iget-object v0, p0, Ll/ۚۚ۫;->ۢ:Ll/᩻ۚ۫;

    iget-object v0, v0, Ll/᩻ۚ۫;->ۗۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 2

    .line 823
    iget-boolean v0, p0, Ll/ۚۚ۫;->ܿ:Z

    if-eqz v0, :cond_0

    .line 824
    iget-object v0, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/ۚۚ۫;->ۢ:Ll/᩻ۚ۫;

    invoke-static {v1, v0}, Ll/᩻ۚ۫;->ۙ(Ll/᩻ۚ۫;Ll/᩷ۨᩴ;)V

    .line 825
    new-instance v0, Ll/۠᩸ۨ;

    iget-object v1, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-direct {v0, v1}, Ll/۠᩸ۨ;-><init>(Ll/᩷ۨᩴ;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ(I)V
    .locals 1

    .line 772
    iget v0, p0, Ll/ۚۚ۫;->᩶:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۚۚ۫;->᩶:I

    .line 773
    iget-object v0, p0, Ll/ۚۚ۫;->ۤۙ:[Ll/֫ۚ۫;

    aget-object v0, v0, p1

    if-nez v0, :cond_0

    .line 774
    iget-object v0, p0, Ll/ۚۚ۫;->֨:Lnet/sf/sevenzipjbinding/IInArchive;

    invoke-static {v0, p1}, Ll/֫ܳ᩸;->ۙ(Lnet/sf/sevenzipjbinding/IInArchive;I)Ll/֫ܳ᩸;

    move-result-object p1

    iget-object v0, p0, Ll/ۚۚ۫;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ᩶()V
    .locals 5

    .line 837
    iget-boolean v0, p0, Ll/ۚۚ۫;->ܿ:Z

    if-eqz v0, :cond_2

    .line 838
    iget-object v0, p0, Ll/ۚۚ۫;->֡:Ll/֫ܳ᩸;

    invoke-virtual {v0}, Ll/֫ܳ᩸;->֫()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-boolean v0, p0, Ll/ۚۚ۫;->ۙۙ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۛ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 839
    iget-object v0, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    iget-object v1, p0, Ll/ۚۚ۫;->֡:Ll/֫ܳ᩸;

    invoke-virtual {v1}, Ll/֫ܳ᩸;->֫()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/᩷ۨᩴ;->ۙ(J)Z

    .line 841
    :cond_0
    iget-object v0, p0, Ll/ۚۚ۫;->ۢ:Ll/᩻ۚ۫;

    iget-boolean v1, v0, Ll/᩻ۚ۫;->ۘۙ:Z

    if-eqz v1, :cond_1

    .line 842
    iget-object v1, v0, Ll/᩻ۚ۫;->ۛۙ:Ll/᩺᩵ᩴ;

    iget-object v2, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {v1, v2}, Ll/᩺᩵ᩴ;->᩸(Ll/᩷ۨᩴ;)V

    .line 844
    :cond_1
    iget-object v1, p0, Ll/ۚۚ۫;->֡:Ll/֫ܳ᩸;

    .line 845
    invoke-virtual {v1}, Ll/֫ܳ᩸;->ۤ()I

    move-result v1

    iget-object v2, p0, Ll/ۚۚ۫;->ۖ:[Ljava/lang/String;

    aget-object v1, v2, v1

    iget-object v2, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 844
    iget-object v3, p0, Ll/ۚۚ۫;->ۜ:Ll/ۗܳ۫;

    invoke-virtual {v3, v1, v2}, Ll/ۗܳ۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 846
    iget-object v1, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-static {v1}, Ll/ᩴ᩸۫;->ۙ(Ll/᩷ۨᩴ;)V

    .line 847
    iget-object v1, p0, Ll/ۚۚ۫;->۟:Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۚۚ۫;->᩷ۙ:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩻ۚ۫;->ۙ(Ll/᩻ۚ۫;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final ᩷(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 0

    .line 744
    invoke-static {p1}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public final ᩷ۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 766
    iput v0, p0, Ll/ۚۚ۫;->᩶:I

    .line 767
    iget-object v0, p0, Ll/ۚۚ۫;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ᩸ۙ()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1

    .line 739
    iget-object v0, p0, Ll/ۚۚ۫;->֨:Lnet/sf/sevenzipjbinding/IInArchive;

    return-object v0
.end method
