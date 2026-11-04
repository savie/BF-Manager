.class public Ll/᩻ۚ۫;
.super Ll/ᩴۙ᩻;
.source "A1YB"


# static fields
.field public static final synthetic ܿۙ:I


# instance fields
.field public ۗۙ:Ljava/lang/String;

.field public ۘۙ:Z

.field public ۛۙ:Ll/᩺᩵ᩴ;

.field public ۨۙ:Ljava/util/HashSet;

.field public ܰۙ:Z

.field public ܶۙ:Ll/ܿ᩸۫;

.field public ᩵ۙ:Ljava/util/HashSet;

.field public ᩶ۙ:Ll/᩸ۧ۫;

.field public ᩹ۙ:Z

.field public final ᩺ۙ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 150
    invoke-direct {p0}, Ll/ᩴۙ᩻;-><init>()V

    .line 151
    new-instance v0, Ll/᩺᩵ᩴ;

    invoke-direct {v0}, Ll/᩺᩵ᩴ;-><init>()V

    iput-object v0, p0, Ll/᩻ۚ۫;->ۛۙ:Ll/᩺᩵ᩴ;

    .line 152
    new-instance v0, Ll/ܿ᩸۫;

    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Ll/ܿ᩸۫;-><init>(Z)V

    .line 152
    iput-object v0, p0, Ll/᩻ۚ۫;->ܶۙ:Ll/ܿ᩸۫;

    .line 153
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩻ۚ۫;->ۨۙ:Ljava/util/HashSet;

    .line 50
    new-instance v0, Ll/᩸ۧ۫;

    invoke-direct {v0}, Ll/᩸ۧ۫;-><init>()V

    .line 158
    iput-object v0, p0, Ll/᩻ۚ۫;->᩶ۙ:Ll/᩸ۧ۫;

    .line 991
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩻ۚ۫;->᩵ۙ:Ljava/util/HashSet;

    .line 992
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩻ۚ۫;->᩺ۙ:Ljava/util/HashSet;

    return-void
.end method

.method private ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I
    .locals 7

    .line 877
    iget-object v0, p0, Ll/᩻ۚ۫;->᩶ۙ:Ll/᩸ۧ۫;

    invoke-virtual {v0, p1}, Ll/᩸ۧ۫;->᩷(Ll/᩷ۨᩴ;)Z

    move-result v6

    .line 879
    iget-object v0, p0, Ll/᩻ۚ۫;->ܶۙ:Ll/ܿ᩸۫;

    invoke-virtual {v0, v6}, Ll/ܿ᩸۫;->ۙ(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 881
    invoke-static {p3, p4, p5, p6}, Ll/᩶᩷۫;->ۙ(JJ)Ll/᩶᩷۫;

    move-result-object v3

    .line 882
    invoke-static {p1}, Ll/᩶᩷۫;->ۙ(Ll/᩷ۨᩴ;)Ll/᩶᩷۫;

    move-result-object v4

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۨ᩷()Z

    move-result v5

    move-object v1, v0

    move-object v2, p2

    .line 880
    invoke-virtual/range {v1 .. v6}, Ll/ܿ᩸۫;->ۙ(Ljava/lang/String;Ll/᩶᩷۫;Ll/᩶᩷۫;ZZ)I

    move-result p1

    goto :goto_0

    .line 885
    :cond_0
    sget-object v4, Ll/᩶᩷۫;->ۤ:Ll/᩶᩷۫;

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p2

    move-object v3, v4

    invoke-virtual/range {v1 .. v6}, Ll/ܿ᩸۫;->ۙ(Ljava/lang/String;Ll/᩶᩷۫;Ll/᩶᩷۫;ZZ)I

    move-result p1

    .line 888
    :goto_0
    invoke-virtual {v0}, Ll/ܿ᩸۫;->۫()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 889
    invoke-virtual {p0}, Ll/ᩳۜۧ;->cancel()V

    :cond_1
    return p1
.end method

.method public static bridge synthetic ۙ(Ll/᩻ۚ۫;Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p6}, Ll/᩻ۚ۫;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I

    move-result p0

    return p0
.end method

.method private ۙ(Ll/᩷ۨᩴ;ILjava/util/ArrayList;Ll/ۗܳ۫;)V
    .locals 6

    .line 916
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const v0, 0x7f12037c

    .line 919
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    .line 920
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۚ۫;

    .line 301
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v2

    if-nez v2, :cond_1

    .line 941
    iget-object v2, v1, Ll/֫ۚ۫;->᩷:Ljava/lang/String;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 942
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫ۚ۫;

    if-eq v5, v1, :cond_2

    .line 943
    iget-object v5, v5, Ll/֫ۚ۫;->᩷:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 924
    :cond_3
    invoke-virtual {p1, v2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v3

    .line 925
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->֨()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    .line 928
    :cond_4
    invoke-virtual {p0, v2}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 929
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v4

    invoke-direct {p0, v4}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    .line 930
    iget-object v4, v1, Ll/֫ۚ۫;->ۤ:Ljava/lang/String;

    .line 931
    invoke-virtual {p4, v2, v4}, Ll/ۗܳ۫;->᩷(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 930
    invoke-virtual {v3, v2}, Ll/᩷ۨᩴ;->ۤ(Ljava/lang/String;)V

    .line 932
    iget-boolean v1, v1, Ll/֫ۚ۫;->ۙ:Z

    if-nez v1, :cond_5

    .line 933
    sget v1, Ll/ᩴ᩸۫;->ۙ:I

    .line 213
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 217
    invoke-static {v1, v2}, Ll/ᩴ᩸۫;->ۙ(Ljava/lang/String;Z)V

    .line 935
    :cond_5
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩻ۚ۫;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩻ۚ۫;Ll/᩷ۨᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public static ۙ(Ll/᩻ۚ۫;Ll/᩷ۨᩴ;ILnet/sf/sevenzipjbinding/IInArchive;Ll/᩷ۨᩴ;[Ljava/lang/String;[Ll/֫ۚ۫;)V
    .locals 18

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move-object/from16 v14, p6

    .line 722
    invoke-static {}, Ll/᩶᩷ۧ;->ۨ()Z

    move-result v15

    .line 723
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 724
    new-instance v11, Ll/ۗܳ۫;

    invoke-direct {v11}, Ll/ۗܳ۫;-><init>()V

    .line 725
    new-instance v10, Ll/ۚۚ۫;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, v16

    move-object/from16 v6, p6

    move-object/from16 v7, p5

    move-object/from16 v8, p1

    move v9, v15

    move-object v14, v10

    move-object v10, v11

    move-object/from16 v17, v11

    move/from16 v11, p2

    invoke-direct/range {v0 .. v11}, Ll/ۚۚ۫;-><init>(Ll/᩻ۚ۫;Ll/᩻ۚ۫;Lnet/sf/sevenzipjbinding/IInArchive;Ll/᩷ۨᩴ;Ljava/util/ArrayList;[Ll/֫ۚ۫;[Ljava/lang/String;Ll/᩷ۨᩴ;ZLl/ۗܳ۫;I)V

    const/4 v0, 0x0

    invoke-static {v0, v0, v14}, Ll/᩷۫᩸;->ۙ(Ll/ܽ֡֫;[ILl/ۖܳ᩸;)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7f12037c

    .line 855
    invoke-virtual {v12, v0}, Ll/ᩳۜۧ;->᩻(I)V

    .line 856
    new-instance v0, Ll/ۗۧܺ;

    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v1, v1

    invoke-direct {v0, v1, v2}, Ll/ۗۧܺ;-><init>(J)V

    new-instance v1, Ll/ۧ᩷ܳ;

    invoke-direct {v1, v12}, Ll/ۧ᩷ܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    .line 857
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ܳ᩸;

    const/4 v3, 0x1

    .line 41
    invoke-virtual {v0, v3}, Ll/ۗۧܺ;->ۙ(I)Z

    .line 859
    invoke-virtual {v2}, Ll/֫ܳ᩸;->ۤ()I

    move-result v3

    aget-object v3, p5, v3

    .line 860
    invoke-virtual {v12, v3}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 861
    invoke-virtual {v13, v3}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    .line 862
    invoke-direct {v12, v4}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    .line 863
    invoke-virtual {v2}, Ll/֫ܳ᩸;->֫()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    if-eqz v15, :cond_1

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۛ᩷()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 864
    invoke-virtual {v2}, Ll/֫ܳ᩸;->֫()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ll/᩷ۨᩴ;->ۙ(J)Z

    .line 866
    :cond_1
    invoke-direct {v12, v3}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    goto :goto_0

    .line 900
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p6

    .line 901
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    if-eqz v4, :cond_3

    .line 903
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    move/from16 v3, p2

    move-object/from16 v4, v17

    .line 906
    invoke-direct {v12, v13, v3, v0, v4}, Ll/᩻ۚ۫;->ۙ(Ll/᩷ۨᩴ;ILjava/util/ArrayList;Ll/ۗܳ۫;)V

    return-void
.end method

.method private ۤ(Ll/᩷ۨᩴ;)V
    .locals 3

    .line 998
    iget-object v0, p0, Ll/᩻ۚ۫;->᩺ۙ:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1002
    :cond_0
    :try_start_0
    sget-object v0, Ll/ۨ۠ۧ;->֡:Ll/ۨ۠ۧ;

    invoke-static {p1, v0}, Ll/ۛ۠ۧ;->ۙ(Ll/᩷ۨᩴ;Ll/ۨ۠ۧ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1006
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֡()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1007
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot create extract directory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/֨᩵ᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1007
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 1004
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private ܰ(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x2f

    .line 959
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    .line 960
    iget-object v2, p0, Ll/᩻ۚ۫;->ۨۙ:Ljava/util/HashSet;

    if-ne v0, v1, :cond_0

    .line 961
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 963
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ᩷(Ll/᩷ۨᩴ;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1014
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻ۚ۫;->᩵ۙ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1016
    :cond_1
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1017
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֡()Z

    .line 1018
    :cond_2
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1019
    :cond_3
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 1020
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_4
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩻ۚ۫;Ll/᩷ۨᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩻ۚ۫;->ۤ(Ll/᩷ۨᩴ;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const v0, 0x7f120956

    .line 177
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    const-string v0, "..."

    .line 178
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Lbin/mt/plus/Main;Ll/۠ۨܳ;Ll/۠ۨܳ;Ll/ۨۜۧ;)V
    .locals 0

    .line 969
    invoke-virtual {p4}, Ll/ۨۜۧ;->᩸()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 970
    iget-boolean p1, p0, Ll/᩻ۚ۫;->᩹ۙ:Z

    iget-object p4, p0, Ll/᩻ۚ۫;->ۨۙ:Ljava/util/HashSet;

    if-eqz p1, :cond_0

    .line 971
    invoke-virtual {p0, p3}, Ll/ᩳۜۧ;->ۙ(Ll/۠ۨܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 972
    invoke-virtual {p3}, Ll/۠ۨܳ;->ܳ()V

    .line 973
    invoke-virtual {p3, p4}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 974
    invoke-virtual {p3}, Ll/۠ۨܳ;->ܽۙ()V

    return-void

    .line 977
    :cond_0
    invoke-virtual {p0, p2}, Ll/ᩳۜۧ;->᩷(Ll/۠ۨܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 978
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܳ()V

    .line 979
    invoke-virtual {p2, p4}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 980
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܽۙ()V

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/ۨۜۧ;
    .locals 46

    move-object/from16 v10, p0

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {v10, v0}, Ll/ᩳۜۧ;->ۗ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 50
    new-instance v1, Ll/᩸ۧ۫;

    invoke-direct {v1}, Ll/᩸ۧ۫;-><init>()V

    .line 51
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    new-array v6, v3, [Ljava/lang/String;

    .line 52
    invoke-static {v5, v6}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 186
    :cond_0
    iput-object v1, v10, Ll/᩻ۚ۫;->᩶ۙ:Ll/᩸ۧ۫;

    .line 187
    invoke-static {v0, v1, v10}, Ll/᩷ۧ۫;->ۙ([Ljava/lang/String;Ll/᩸ۧ۫;Ll/᩻ۚ۫;)Ljava/util/ArrayList;

    move-result-object v0

    .line 188
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 189
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v1, "extractDir"

    .line 191
    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->᩹(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v11

    const-string v1, "separateFolder"

    .line 192
    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ۤ(Ljava/lang/String;)Z

    move-result v12

    const-string v1, "relativeNameSubStart"

    .line 193
    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ܺ(Ljava/lang/String;)I

    move-result v13

    const-string v1, "extractToAnother"

    .line 194
    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ۤ(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v10, Ll/᩻ۚ۫;->᩹ۙ:Z

    const-string v1, "deleteSources"

    .line 195
    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ۤ(Ljava/lang/String;)Z

    move-result v14

    .line 197
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, v10, Ll/᩻ۚ۫;->ܰۙ:Z

    .line 198
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 200
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v1, 0x0

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v9, :cond_59

    const-string v6, ")"

    const-string v7, "/"

    const-string v4, "("

    if-le v9, v2, :cond_3

    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f12037c

    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v8, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ۘ(Ljava/lang/String;)V

    .line 204
    :cond_3
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۧ۫;

    .line 205
    iget-object v5, v1, Ll/᩷ۧ۫;->ۙ:Ll/᩷ۨᩴ;

    if-eqz v12, :cond_5

    .line 207
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-static {v2}, Ll/ܽܳ᩸;->᩷(Ljava/lang/String;)Ll/ܺܳ᩸;

    move-result-object v16

    if-nez v16, :cond_4

    goto :goto_3

    .line 25
    :cond_4
    invoke-virtual/range {v16 .. v16}, Ll/ܺܳ᩸;->ۙ()Ljava/lang/String;

    move-result-object v2

    .line 83
    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v16

    invoke-static {v2}, Ll/᩷ۨᩴ;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    move-object/from16 v18, v0

    sub-int v0, v16, v17

    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 207
    invoke-virtual {v11, v0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object/from16 v18, v0

    move-object v0, v11

    .line 208
    :goto_4
    sget-object v2, Ll/۬۫۫;->ۙ:[I

    iget-object v3, v1, Ll/᩷ۧ۫;->ۤ:Ll/۫ۘܳ;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    iget-object v3, v10, Ll/᩻ۚ۫;->ܶۙ:Ll/ܿ᩸۫;

    move-object/from16 v16, v11

    iget-object v11, v10, Ll/᩻ۚ۫;->ۛۙ:Ll/᩺᩵ᩴ;

    move-object/from16 v17, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_38

    const/4 v3, 0x2

    if-eq v2, v3, :cond_17

    const/4 v1, 0x3

    if-eq v2, v1, :cond_7

    .line 224
    invoke-virtual/range {p0 .. p0}, Ll/ᩴۙ᩻;->ۢۙ()V

    if-eqz v14, :cond_6

    move-object v3, v15

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    move-object v3, v1

    .line 672
    :goto_5
    new-instance v7, Ll/۫ۚ۫;

    move-object v1, v7

    move-object/from16 v2, p0

    move-object v4, v0

    move-object v0, v5

    move v5, v13

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Ll/۫ۚ۫;-><init>(Ll/᩻ۚ۫;Ljava/util/ArrayList;Ll/᩷ۨᩴ;ILl/᩷ۨᩴ;)V

    const/4 v1, 0x0

    invoke-static {v1, v0, v7}, Ll/ۚ۫᩸;->ۙ(Lbin/mt/plus/Main;Ll/᩷ۨᩴ;Ll/۫۫᩸;)V

    goto :goto_7

    .line 219
    :cond_7
    invoke-virtual/range {p0 .. p0}, Ll/ᩴۙ᩻;->ۢۙ()V

    if-eqz v14, :cond_8

    move-object v1, v15

    goto :goto_6

    :cond_8
    const/4 v1, 0x0

    :goto_6
    if-eqz v1, :cond_9

    .line 601
    new-instance v2, Ll/ۧۚ۫;

    invoke-direct {v2, v5}, Ll/ۧۚ۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 603
    :cond_9
    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ۤ(Ll/᩷ۨᩴ;)V

    .line 604
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_a

    .line 605
    new-instance v1, Ll/᩵ܰᩴ;

    invoke-direct {v1}, Ll/᩵ܰᩴ;-><init>()V

    .line 606
    invoke-virtual {v1, v0}, Ll/᩵ܰᩴ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 607
    invoke-virtual {v1}, Ll/᩵ܰᩴ;->ۙ()Z

    move-result v1

    if-nez v1, :cond_a

    .line 608
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->cancel()V

    :goto_7
    move/from16 v21, v8

    move/from16 v22, v9

    goto/16 :goto_9

    .line 612
    :cond_a
    new-instance v6, Ll/ۡᩴ۫;

    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v1}, Ll/ۡᩴ۫;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 613
    invoke-virtual {v6, v1}, Ll/ۡᩴ۫;->ۙ(Z)V

    .line 614
    invoke-virtual {v6}, Ll/ۡᩴ۫;->ܶ()Ll/ᩳᩴ۫;

    move-result-object v7

    .line 615
    invoke-virtual {v7}, Ll/۫᩶ܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 616
    invoke-virtual {v0, v2}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 617
    iget-boolean v3, v10, Ll/᩻ۚ۫;->ܰۙ:Z

    if-eqz v3, :cond_b

    const v3, 0x7f12037c

    .line 618
    invoke-virtual {v10, v3}, Ll/ᩳۜۧ;->᩻(I)V

    .line 620
    :cond_b
    invoke-virtual {v10, v2}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 621
    invoke-virtual {v10, v1}, Ll/ᩴۙ᩻;->ܺ(I)V

    .line 623
    iput-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 625
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 627
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 628
    invoke-virtual {v7}, Ll/۫᩶ܳ;->getSize()J

    move-result-wide v4

    invoke-virtual {v7}, Ll/۫᩶ܳ;->getTime()J

    move-result-wide v19

    move-object/from16 v1, p0

    move-object v2, v0

    move/from16 v21, v8

    move/from16 v22, v9

    move-object v8, v6

    move-object v9, v7

    move-wide/from16 v6, v19

    .line 626
    invoke-direct/range {v1 .. v7}, Ll/᩻ۚ۫;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v2

    if-eqz v2, :cond_c

    goto/16 :goto_9

    :cond_c
    if-eqz v1, :cond_e

    const/4 v2, 0x1

    if-eq v1, v2, :cond_15

    const/4 v3, 0x2

    if-eq v1, v3, :cond_d

    goto :goto_8

    .line 1147
    :cond_d
    invoke-virtual {v0, v2}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v0

    goto :goto_8

    :cond_e
    const/4 v1, 0x1

    .line 634
    invoke-virtual {v11, v0}, Ll/᩺᩵ᩴ;->᩷(Ll/᩷ۨᩴ;)V

    .line 635
    iput-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 636
    invoke-virtual/range {v17 .. v17}, Ll/ܿ᩸۫;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۨ᩷()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 637
    invoke-virtual {v0, v10}, Ll/᩷ۨᩴ;->᩷(Ll/۟֡֫;)Z

    goto :goto_8

    :cond_f
    move/from16 v21, v8

    move/from16 v22, v9

    move-object v8, v6

    move-object v9, v7

    .line 647
    :cond_10
    :goto_8
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    .line 185
    invoke-virtual {v8, v9}, Ll/ۡᩴ۫;->ۙ(Ll/ۖۗܳ;)Ll/᩹᩸۫;

    move-result-object v1

    const/4 v2, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v0, v2}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 653
    :try_start_1
    invoke-virtual {v1}, Ll/᩹᩸۫;->ۙ()Ll/ۗۧܺ;

    move-result-object v3

    new-instance v4, Ll/ۧ᩷ܳ;

    invoke-direct {v4, v10}, Ll/ۧ᩷ܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    const/16 v3, 0x400

    new-array v3, v3, [B

    .line 656
    :cond_11
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_12

    const/4 v5, 0x0

    .line 657
    invoke-virtual {v2, v3, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_11

    .line 662
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_9

    :cond_12
    if-eqz v2, :cond_13

    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_13
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 663
    iget-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    if-eqz v1, :cond_14

    .line 664
    invoke-virtual {v11, v0}, Ll/᩺᩵ᩴ;->᩸(Ll/᩷ۨᩴ;)V

    .line 666
    :cond_14
    sget v1, Ll/ᩴ᩸۫;->ۙ:I

    .line 213
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 217
    invoke-static {v1, v2}, Ll/ᩴ᩸۫;->ۙ(Ljava/lang/String;Z)V

    .line 667
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    :cond_15
    :goto_9
    move/from16 v20, v12

    move/from16 v27, v14

    move-object/from16 v25, v15

    goto/16 :goto_17

    :catchall_0
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_16

    .line 650
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_16
    :goto_a
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v2

    :cond_17
    move/from16 v21, v8

    move/from16 v22, v9

    .line 214
    invoke-virtual/range {p0 .. p0}, Ll/ᩴۙ᩻;->֨ۙ()V

    .line 215
    iget-object v1, v1, Ll/᩷ۧ۫;->᩸:Ll/۫ۖ۫;

    if-eqz v14, :cond_18

    move-object v2, v15

    goto :goto_c

    :cond_18
    const/4 v2, 0x0

    .line 449
    :goto_c
    invoke-virtual {v1}, Ll/۫ۖ۫;->ۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_19
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۨᩴ;

    .line 450
    iget-object v5, v10, Ll/᩻ۚ۫;->᩶ۙ:Ll/᩸ۧ۫;

    invoke-virtual {v5, v4}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;)V

    if-eqz v2, :cond_19

    .line 452
    new-instance v5, Ll/ۧۚ۫;

    invoke-direct {v5, v4}, Ll/ۧۚ۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 455
    :cond_1a
    invoke-virtual {v1}, Ll/۫ۖ۫;->᩸()J

    move-result-wide v2

    .line 456
    invoke-virtual {v1}, Ll/۫ۖ۫;->ᩴ()Ljava/io/BufferedInputStream;

    move-result-object v8

    .line 457
    :try_start_7
    new-instance v4, Ll/ᩴۚ۫;

    invoke-direct {v4, v10, v8, v2, v3}, Ll/ᩴۚ۫;-><init>(Ll/᩻ۚ۫;Ljava/io/BufferedInputStream;J)V

    .line 474
    invoke-static {}, Ll/᩶᩷ۧ;->ۨ()Z

    move-result v9

    .line 475
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 476
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 954
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 955
    invoke-static {v2}, Ll/ܰۨᩴ;->᩸(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-static {v2}, Ll/ܰۨᩴ;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1b

    const/4 v2, 0x1

    const/16 v19, 0x1

    goto :goto_e

    :cond_1b
    const/4 v2, 0x0

    const/16 v19, 0x0

    .line 478
    :goto_e
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 479
    new-instance v3, Ll/ۗܳ۫;

    invoke-direct {v3}, Ll/ۗܳ۫;-><init>()V

    .line 480
    new-instance v2, Ll/᩷ۚ۫;

    invoke-direct {v2, v4}, Ll/᩷ۚ۫;-><init>(Ljava/io/InputStream;)V

    invoke-static {v8, v2}, Ll/ۢۡ۫;->ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۡ;)Ljava/io/InputStream;

    move-result-object v2

    if-nez v2, :cond_1c

    goto :goto_f

    :cond_1c
    move-object v4, v2

    .line 482
    :goto_f
    invoke-virtual {v1}, Ll/۫ۖ۫;->᩷()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۫ۖ۫;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1d

    const/4 v1, 0x1

    const/4 v2, 0x1

    goto :goto_10

    :cond_1d
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_10
    if-eqz v2, :cond_1e

    const/16 v1, 0x200

    goto :goto_11

    :cond_1e
    const/16 v1, 0x2800

    :goto_11
    move/from16 v20, v12

    .line 486
    new-instance v12, Ll/۬᩹ۨ;

    move-object/from16 v23, v3

    const/4 v3, 0x0

    .line 184
    invoke-direct {v12, v4, v1, v3}, Ll/۬᩹ۨ;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    .line 487
    invoke-virtual {v12, v2}, Ll/۬᩹ۨ;->ۙ(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    .line 422
    :goto_12
    :try_start_8
    invoke-virtual {v12}, Ll/۬᩹ۨ;->ܳ()Ll/ۜ᩹ۨ;

    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    if-eqz v3, :cond_31

    if-eqz v19, :cond_1f

    .line 490
    :try_start_9
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->ۜ()Z

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    if-eqz v1, :cond_1f

    const/4 v1, 0x1

    goto :goto_13

    :catchall_4
    move-exception v0

    move-object v1, v0

    move-object/from16 v23, v8

    goto/16 :goto_1e

    :cond_1f
    const/4 v1, 0x0

    :goto_13
    move/from16 v24, v2

    .line 491
    :try_start_a
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->᩹()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_20

    const/16 v25, 0x0

    move-object/from16 v26, v4

    const/4 v4, 0x0

    goto :goto_14

    .line 492
    :cond_20
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->᩶()Z

    move-result v25

    move-object/from16 v26, v4

    move/from16 v4, v25

    .line 491
    :goto_14
    invoke-static {v2, v4}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    if-eqz v1, :cond_21

    .line 493
    :try_start_b
    new-instance v2, Ll/֫ۚ۫;

    move-object/from16 v25, v15

    .line 494
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->ۧ()Ljava/lang/String;

    move-result-object v15

    invoke-static {v4, v15}, Ll/ܰۨᩴ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move/from16 v27, v14

    .line 495
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->᩶()Z

    move-result v14

    invoke-direct {v2, v4, v15, v14}, Ll/֫ۚ۫;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_15

    :cond_21
    move/from16 v27, v14

    move-object/from16 v25, v15

    const/4 v2, 0x0

    .line 496
    :goto_15
    :try_start_c
    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ۤ(Ll/᩷ۨᩴ;)V

    .line 497
    invoke-virtual {v0, v4}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v14

    .line 498
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    move-object/from16 v28, v0

    const/16 v0, 0x1e

    if-lt v15, v0, :cond_24

    if-eqz v1, :cond_22

    .line 499
    :try_start_d
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ۧۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    goto :goto_16

    .line 500
    :cond_22
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->᩶()Z

    move-result v0

    if-eqz v0, :cond_23

    move-object v0, v14

    goto :goto_16

    :cond_23
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ۧۙ()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 501
    :goto_16
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_24

    .line 502
    new-instance v15, Ll/᩵ܰᩴ;

    invoke-direct {v15}, Ll/᩵ܰᩴ;-><init>()V

    .line 503
    invoke-virtual {v15, v0}, Ll/᩵ܰᩴ;->ۙ(Ll/᩷ۨᩴ;)V

    .line 504
    invoke-virtual {v15}, Ll/᩵ܰᩴ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_24

    .line 505
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->cancel()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 594
    :try_start_e
    invoke-virtual {v12}, Ll/۬᩹ۨ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 595
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    :goto_17
    move v0, v13

    goto/16 :goto_30

    .line 510
    :cond_24
    :try_start_f
    iget-boolean v0, v10, Ll/᩻ۚ۫;->ܰۙ:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    if-eqz v0, :cond_25

    const v0, 0x7f12037c

    .line 511
    :try_start_10
    invoke-virtual {v10, v0}, Ll/ᩳۜۧ;->᩻(I)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 513
    :cond_25
    :try_start_11
    invoke-virtual {v10, v4}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 514
    invoke-virtual {v10, v0}, Ll/ᩴۙ᩻;->ܺ(I)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    if-eqz v1, :cond_26

    .line 516
    :try_start_12
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    goto :goto_18

    .line 519
    :cond_26
    :try_start_13
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->᩶()Z

    move-result v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    if-eqz v0, :cond_28

    .line 520
    :try_start_14
    invoke-direct {v10, v14}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    if-eqz v9, :cond_27

    .line 522
    new-instance v0, Ll/ۙۚ۫;

    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->ܽ()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v14, v1, v2}, Ll/ۙۚ۫;-><init>(Ll/᩷ۨᩴ;J)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 524
    :cond_27
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    :goto_18
    move/from16 v2, v24

    move-object/from16 v15, v25

    move-object/from16 v4, v26

    move/from16 v14, v27

    move-object/from16 v0, v28

    goto/16 :goto_12

    :cond_28
    const/4 v0, 0x0

    .line 527
    :try_start_15
    iput-boolean v0, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 529
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 531
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 532
    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->ۨ()J

    move-result-wide v29

    invoke-virtual {v3}, Ll/ۜ᩹ۨ;->ܽ()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v31
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    move-object/from16 v1, p0

    move/from16 v15, v24

    move-object v2, v14

    move/from16 v24, v9

    move-object/from16 v9, v23

    move-object/from16 v23, v8

    move-object v8, v3

    move-object v3, v0

    move-object v0, v4

    move-object/from16 v33, v26

    move-object/from16 v26, v5

    move-wide/from16 v4, v29

    move-object/from16 v29, v6

    move-object/from16 v30, v7

    move-wide/from16 v6, v31

    .line 530
    :try_start_16
    invoke-direct/range {v1 .. v7}, Ll/᩻ۚ۫;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v2

    if-eqz v2, :cond_29

    goto/16 :goto_1c

    :cond_29
    if-eqz v1, :cond_2b

    const/4 v2, 0x1

    if-eq v1, v2, :cond_30

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2a

    goto :goto_19

    .line 1147
    :cond_2a
    invoke-virtual {v14, v2}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v14

    goto :goto_19

    :cond_2b
    const/4 v1, 0x1

    .line 538
    invoke-virtual {v11, v14}, Ll/᩺᩵ᩴ;->᩷(Ll/᩷ۨᩴ;)V

    .line 539
    iput-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 540
    invoke-virtual/range {v17 .. v17}, Ll/ܿ᩸۫;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ۨ᩷()Z

    move-result v1

    if-eqz v1, :cond_2d

    .line 541
    invoke-virtual {v14, v10}, Ll/᩷ۨᩴ;->᩷(Ll/۟֡֫;)Z

    goto :goto_19

    :cond_2c
    move-object v0, v4

    move-object/from16 v29, v6

    move-object/from16 v30, v7

    move/from16 v15, v24

    move-object/from16 v33, v26

    move-object/from16 v26, v5

    move/from16 v24, v9

    move-object/from16 v9, v23

    move-object/from16 v23, v8

    move-object v8, v3

    .line 551
    :cond_2d
    :goto_19
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    .line 552
    new-instance v1, Ll/ܳۚ۫;

    invoke-direct {v1, v10}, Ll/ܳۚ۫;-><init>(Ll/᩻ۚ۫;)V

    invoke-static {v12, v8, v14, v1}, Ll/ۢۡ۫;->ۙ(Ll/۬᩹ۨ;Ll/ۜ᩹ۨ;Ll/᩷ۨᩴ;Ll/ᩳۡ۫;)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_2e

    goto/16 :goto_1c

    .line 565
    :cond_2e
    iget-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    if-eqz v1, :cond_2f

    .line 566
    invoke-virtual {v11, v14}, Ll/᩺᩵ᩴ;->᩸(Ll/᩷ۨᩴ;)V

    .line 568
    :cond_2f
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ll/ۗܳ۫;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    sget v0, Ll/ᩴ᩸۫;->ۙ:I

    .line 213
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 217
    invoke-static {v0, v1}, Ll/ᩴ᩸۫;->ۙ(Ljava/lang/String;Z)V

    .line 570
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    :cond_30
    move v2, v15

    move-object/from16 v8, v23

    move-object/from16 v15, v25

    move-object/from16 v5, v26

    move/from16 v14, v27

    move-object/from16 v0, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v4, v33

    move-object/from16 v23, v9

    move/from16 v9, v24

    goto/16 :goto_12

    :cond_31
    move-object/from16 v28, v0

    move-object/from16 v33, v4

    move-object/from16 v26, v5

    move-object/from16 v29, v6

    move/from16 v27, v14

    move-object/from16 v25, v15

    move-object/from16 v9, v23

    move v15, v2

    move-object/from16 v23, v8

    if-eqz v15, :cond_35

    const/16 v0, 0x2000

    new-array v0, v0, [B

    move-object/from16 v2, v33

    .line 576
    :cond_32
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_35

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v3

    if-eqz v3, :cond_33

    goto :goto_1c

    :cond_33
    const/4 v3, 0x0

    :goto_1a
    if-ge v3, v1, :cond_32

    .line 581
    aget-byte v4, v0, v3

    if-nez v4, :cond_34

    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    .line 582
    :cond_34
    new-instance v0, Ljava/io/IOException;

    const v1, 0x7f120be3

    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    move-object/from16 v0, v28

    .line 588
    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ۤ(Ll/᩷ۨᩴ;)V

    .line 589
    invoke-virtual/range {v29 .. v29}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_36
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙۚ۫;

    .line 1052
    iget-object v3, v2, Ll/ۙۚ۫;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ۛ᩷()Z

    move-result v4

    if-eqz v4, :cond_36

    .line 1053
    iget-wide v4, v2, Ll/ۙۚ۫;->᩷:J

    invoke-virtual {v3, v4, v5}, Ll/᩷ۨᩴ;->ۙ(J)Z

    goto :goto_1b

    :cond_37
    move-object/from16 v1, v26

    .line 592
    invoke-direct {v10, v0, v13, v1, v9}, Ll/᩻ۚ۫;->ۙ(Ll/᩷ۨᩴ;ILjava/util/ArrayList;Ll/ۗܳ۫;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    .line 594
    :goto_1c
    :try_start_17
    invoke-virtual {v12}, Ll/۬᩹ۨ;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    .line 595
    invoke-virtual/range {v23 .. v23}, Ljava/io/InputStream;->close()V

    goto/16 :goto_17

    :catchall_5
    move-exception v0

    goto :goto_1d

    :catchall_6
    move-exception v0

    move-object/from16 v23, v8

    :goto_1d
    move-object v1, v0

    .line 486
    :goto_1e
    :try_start_18
    invoke-virtual {v12}, Ll/۬᩹ۨ;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    goto :goto_1f

    :catchall_7
    move-exception v0

    move-object v2, v0

    :try_start_19
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1f
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    :catchall_8
    move-exception v0

    goto :goto_20

    :catchall_9
    move-exception v0

    move-object/from16 v23, v8

    :goto_20
    move-object v1, v0

    .line 456
    :try_start_1a
    invoke-virtual/range {v23 .. v23}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    goto :goto_21

    :catchall_a
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_21
    throw v1

    :cond_38
    move/from16 v21, v8

    move/from16 v22, v9

    move/from16 v20, v12

    move/from16 v27, v14

    move-object/from16 v25, v15

    .line 210
    invoke-virtual/range {p0 .. p0}, Ll/ᩴۙ᩻;->֨ۙ()V

    if-eqz v27, :cond_39

    move-object/from16 v1, v25

    goto :goto_22

    :cond_39
    const/4 v1, 0x0

    .line 269
    :goto_22
    new-instance v14, Ll/᩸ܽܺ;

    invoke-direct {v14, v5}, Ll/᩸ܽܺ;-><init>(Ll/᩷ۨᩴ;)V

    .line 271
    :try_start_1b
    invoke-virtual {v14}, Ll/᩸ܽܺ;->᩵()[B

    move-result-object v2

    .line 272
    iget-object v3, v10, Ll/᩻ۚ۫;->᩶ۙ:Ll/᩸ۧ۫;

    invoke-virtual {v3, v5, v2}, Ll/᩸ۧ۫;->ۙ(Ll/᩷ۨᩴ;[B)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_d

    if-eqz v1, :cond_3a

    .line 274
    :try_start_1c
    invoke-static {v5, v2}, Ll/᩸ۧ۫;->᩷(Ll/᩷ۨᩴ;[B)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_23
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۨᩴ;

    .line 275
    new-instance v8, Ll/ۧۚ۫;

    invoke-direct {v8, v3}, Ll/ۧۚ۫;-><init>(Ll/᩷ۨᩴ;)V

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    goto :goto_23

    :catchall_b
    move-exception v0

    goto/16 :goto_28

    .line 278
    :cond_3a
    :try_start_1d
    invoke-virtual {v5}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۘܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 279
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_d

    if-nez v2, :cond_3b

    .line 280
    :try_start_1e
    invoke-virtual {v14, v1}, Ll/᩸ܽܺ;->ۙ(Ljava/lang/String;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_b

    goto :goto_24

    .line 281
    :cond_3b
    :try_start_1f
    iget-object v1, v10, Ll/᩻ۚ۫;->ۗۙ:Ljava/lang/String;
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_d

    if-eqz v1, :cond_3c

    .line 282
    :try_start_20
    invoke-virtual {v14, v1}, Ll/᩸ܽܺ;->ۙ(Ljava/lang/String;)V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_b

    .line 284
    :cond_3c
    :goto_24
    :try_start_21
    invoke-virtual {v14}, Ll/᩸ܽܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    .line 285
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_d

    if-eqz v3, :cond_3d

    :try_start_22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺܺ;

    .line 286
    invoke-virtual {v3}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Ll/۟ܺܺ;->isDirectory()Z

    move-result v3

    invoke-static {v8, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Z)Ljava/lang/String;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_b

    goto :goto_25

    .line 288
    :cond_3d
    :try_start_23
    invoke-direct {v10, v0}, Ll/᩻ۚ۫;->ۤ(Ll/᩷ۨᩴ;)V

    .line 289
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_d

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_40

    .line 290
    :try_start_24
    new-instance v2, Ll/᩵ܰᩴ;

    invoke-direct {v2}, Ll/᩵ܰᩴ;-><init>()V

    .line 291
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۟ܺܺ;

    .line 292
    invoke-virtual {v8}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ll/۟ܺܺ;->isDirectory()Z

    move-result v15

    invoke-static {v9, v15}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 293
    invoke-virtual {v0, v9}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v9

    .line 294
    invoke-virtual {v8}, Ll/۟ܺܺ;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_3e

    .line 295
    invoke-virtual {v2, v9}, Ll/᩵ܰᩴ;->ۙ(Ll/᩷ۨᩴ;)V

    goto :goto_26

    .line 297
    :cond_3e
    invoke-virtual {v9}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/᩵ܰᩴ;->ۙ(Ll/᩷ۨᩴ;)V

    goto :goto_26

    .line 300
    :cond_3f
    invoke-virtual {v2}, Ll/᩵ܰᩴ;->ۙ()Z

    move-result v2

    if-nez v2, :cond_40

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->cancel()V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_b

    .line 444
    invoke-virtual {v14}, Ll/᩸ܽܺ;->close()V

    goto/16 :goto_17

    .line 307
    :cond_40
    :try_start_25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v8, 0x0

    move v15, v13

    move-wide v12, v8

    :cond_41
    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_d

    if-eqz v3, :cond_42

    :try_start_26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺܺ;

    .line 308
    invoke-virtual {v3}, Ll/۟ܺܺ;->isDirectory()Z

    move-result v23

    if-nez v23, :cond_41

    .line 309
    invoke-virtual {v3}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v23
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_b

    add-long v12, v12, v23

    goto :goto_27

    :goto_28
    move-object v1, v0

    move-object/from16 v34, v14

    goto/16 :goto_34

    .line 315
    :cond_42
    :try_start_27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 316
    invoke-static {}, Ll/᩶᩷ۧ;->ۨ()Z

    move-result v23

    .line 317
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 318
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v24

    const/4 v1, 0x0

    :goto_29
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_4f

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ll/۟ܺܺ;

    move-object/from16 v28, v5

    .line 319
    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->getName()Ljava/lang/String;

    move-result-object v5

    move/from16 v29, v15

    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->isDirectory()Z

    move-result v15

    invoke-static {v5, v15}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    add-int/lit8 v15, v1, 0x1

    .line 323
    iget-boolean v1, v10, Ll/᩻ۚ۫;->ܰۙ:Z

    if-eqz v1, :cond_43

    .line 324
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_d

    move-object/from16 v34, v14

    const v19, 0x7f12037c

    :try_start_28
    invoke-static/range {v19 .. v19}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ۘ(Ljava/lang/String;)V

    goto :goto_2a

    :cond_43
    move-object/from16 v34, v14

    const v19, 0x7f12037c

    .line 326
    :goto_2a
    invoke-virtual {v10, v5}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 327
    invoke-virtual {v10, v1}, Ll/ᩴۙ᩻;->ܺ(I)V

    .line 328
    invoke-static {v8, v9, v12, v13}, Ll/ۗۧܺ;->ۙ(JJ)I

    move-result v1

    invoke-virtual {v10, v1}, Ll/ᩳۜۧ;->ۧ(I)V

    .line 329
    invoke-virtual {v0, v5}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v14

    .line 330
    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_45

    .line 331
    invoke-direct {v10, v14}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    if-eqz v23, :cond_44

    .line 333
    new-instance v1, Ll/ۙۚ۫;

    move/from16 v30, v3

    move-object v5, v4

    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->getTime()J

    move-result-wide v3

    invoke-direct {v1, v14, v3, v4}, Ll/ۙۚ۫;-><init>(Ll/᩷ۨᩴ;J)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    :cond_44
    move/from16 v30, v3

    move-object v5, v4

    .line 335
    :goto_2b
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    move/from16 v4, v29

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    move-object/from16 v39, v0

    move-object/from16 v37, v2

    move v0, v4

    move-object/from16 v40, v5

    move-object/from16 v42, v6

    move-object/from16 v43, v7

    move-object/from16 v41, v28

    move/from16 v38, v30

    goto/16 :goto_2d

    :cond_45
    move/from16 v30, v3

    move-object v5, v4

    move/from16 v4, v29

    const/4 v1, 0x0

    .line 338
    iput-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 341
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->֨()Z

    move-result v1

    if-eqz v1, :cond_4a

    .line 343
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 344
    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v31

    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->getTime()J

    move-result-wide v35

    move-object/from16 v1, p0

    move-object/from16 v37, v2

    move-object v2, v14

    move/from16 v38, v30

    move-object/from16 v39, v0

    move v0, v4

    move-object/from16 v40, v5

    move-object/from16 v41, v28

    move-wide/from16 v4, v31

    move-object/from16 v42, v6

    move-object/from16 v43, v7

    move-wide/from16 v6, v35

    .line 342
    invoke-direct/range {v1 .. v7}, Ll/᩻ۚ۫;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v2

    if-eqz v2, :cond_46

    goto/16 :goto_2f

    :cond_46
    if-eqz v1, :cond_49

    const/4 v2, 0x1

    if-eq v1, v2, :cond_48

    const/4 v3, 0x2

    if-eq v1, v3, :cond_47

    goto :goto_2c

    .line 1147
    :cond_47
    invoke-virtual {v14, v2}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v14

    goto :goto_2c

    .line 357
    :cond_48
    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v1

    add-long/2addr v8, v1

    goto/16 :goto_2d

    .line 350
    :cond_49
    invoke-virtual {v11, v14}, Ll/᩺᩵ᩴ;->᩷(Ll/᩷ۨᩴ;)V

    const/4 v1, 0x1

    .line 351
    iput-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    .line 352
    invoke-virtual/range {v17 .. v17}, Ll/ܿ᩸۫;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_4b

    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ۨ᩷()Z

    move-result v1

    if-eqz v1, :cond_4b

    .line 353
    invoke-virtual {v14, v10}, Ll/᩷ۨᩴ;->᩷(Ll/۟֡֫;)Z

    goto :goto_2c

    :cond_4a
    move-object/from16 v39, v0

    move-object/from16 v37, v2

    move v0, v4

    move-object/from16 v40, v5

    move-object/from16 v42, v6

    move-object/from16 v43, v7

    move-object/from16 v41, v28

    move/from16 v38, v30

    .line 364
    :cond_4b
    :goto_2c
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->۫ۙ()Ll/᩷ۨᩴ;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/᩻ۚ۫;->᩷(Ll/᩷ۨᩴ;)V

    const/4 v1, 0x1

    new-array v7, v1, [Z

    const/4 v1, 0x0

    aput-boolean v1, v7, v1

    .line 366
    invoke-virtual/range {v41 .. v41}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v28

    new-instance v33, Ll/᩸ۚ۫;

    move-object/from16 v1, v33

    move-object/from16 v2, p0

    move-wide v3, v8

    move-wide v5, v12

    move-object/from16 v35, v7

    move-object/from16 v7, v34

    move-wide/from16 v44, v8

    move-object/from16 v8, v35

    move-object/from16 v9, v26

    invoke-direct/range {v1 .. v9}, Ll/᩸ۚ۫;-><init>(Ll/᩻ۚ۫;JJLl/᩸ܽܺ;[ZLl/۟ܺܺ;)V

    const/16 v32, 0x0

    move-object/from16 v29, v34

    move-object/from16 v30, v26

    move-object/from16 v31, v14

    .line 100
    invoke-static/range {v28 .. v33}, Ll/ᩳۜ۫;->ۙ(Ljava/lang/String;Ll/᩸ܽܺ;Ll/۟ܺܺ;Ll/᩷ۨᩴ;ZLl/֡ۜ۫;)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_4c

    goto/16 :goto_2f

    .line 430
    :cond_4c
    iget-boolean v1, v10, Ll/᩻ۚ۫;->ۘۙ:Z

    if-eqz v1, :cond_4d

    .line 431
    invoke-virtual {v11, v14}, Ll/᩺᩵ᩴ;->᩸(Ll/᩷ۨᩴ;)V

    :cond_4d
    const/4 v1, 0x0

    .line 433
    aget-boolean v1, v35, v1

    if-eqz v1, :cond_4e

    .line 434
    invoke-virtual/range {v41 .. v41}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v34 .. v34}, Ll/᩸ܽܺ;->ۗ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/᩶ۘܳ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    invoke-virtual/range {v34 .. v34}, Ll/᩸ܽܺ;->ۗ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Ll/᩻ۚ۫;->ۗۙ:Ljava/lang/String;

    .line 437
    :cond_4e
    invoke-virtual/range {v26 .. v26}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v1

    add-long v8, v44, v1

    .line 438
    sget v1, Ll/ᩴ᩸۫;->ۙ:I

    .line 213
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 217
    invoke-static {v1, v2}, Ll/ᩴ᩸۫;->ۙ(Ljava/lang/String;Z)V

    .line 439
    invoke-virtual {v14}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/᩻ۚ۫;->ܰ(Ljava/lang/String;)V

    :goto_2d
    move v1, v15

    move-object/from16 v14, v34

    move-object/from16 v2, v37

    move/from16 v3, v38

    move-object/from16 v4, v40

    move-object/from16 v5, v41

    move-object/from16 v6, v42

    move-object/from16 v7, v43

    move v15, v0

    move-object/from16 v0, v39

    goto/16 :goto_29

    :catchall_c
    move-exception v0

    goto/16 :goto_33

    :catchall_d
    move-exception v0

    move-object/from16 v34, v14

    goto/16 :goto_33

    :cond_4f
    move-object/from16 v37, v2

    move-object/from16 v34, v14

    move v0, v15

    .line 441
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_50
    :goto_2e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙۚ۫;

    .line 1052
    iget-object v3, v2, Ll/ۙۚ۫;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ۛ᩷()Z

    move-result v4

    if-eqz v4, :cond_50

    .line 1053
    iget-wide v4, v2, Ll/ۙۚ۫;->᩷:J

    invoke-virtual {v3, v4, v5}, Ll/᩷ۨᩴ;->ۙ(J)Z
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_c

    goto :goto_2e

    .line 444
    :cond_51
    :goto_2f
    invoke-virtual/range {v34 .. v34}, Ll/᩸ܽܺ;->close()V

    .line 228
    :goto_30
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_52

    .line 229
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    :cond_52
    if-eqz v27, :cond_58

    .line 231
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_58

    .line 232
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_53

    const/4 v1, 0x1

    goto :goto_31

    :cond_53
    const/4 v1, 0x0

    :goto_31
    if-eqz v1, :cond_54

    const v2, 0x7f120a3c

    .line 235
    invoke-virtual {v10, v2}, Ll/ᩳۜۧ;->᩻(I)V

    const/4 v2, 0x0

    .line 236
    invoke-virtual {v10, v2}, Ll/ᩳۜۧ;->ۧ(I)V

    .line 237
    invoke-virtual {v10, v2}, Ll/ᩴۙ᩻;->ܺ(I)V

    .line 239
    :cond_54
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_55
    :goto_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_57

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۚ۫;

    if-eqz v1, :cond_56

    .line 241
    iget-object v4, v3, Ll/ۧۚ۫;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 263
    :cond_56
    iget-object v4, v3, Ll/ۧۚ۫;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v5

    if-eqz v5, :cond_55

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v5

    iget-wide v7, v3, Ll/ۧۚ۫;->᩷:J

    cmp-long v9, v5, v7

    if-nez v9, :cond_55

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_55

    .line 244
    iget-object v4, v10, Ll/᩻ۚ۫;->᩶ۙ:Ll/᩸ۧ۫;

    iget-object v3, v3, Ll/ۧۚ۫;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v4, v3}, Ll/᩸ۧ۫;->ۤ(Ll/᩷ۨᩴ;)V

    goto :goto_32

    .line 247
    :cond_57
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->clear()V

    :cond_58
    add-int/lit8 v8, v21, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x1

    move v13, v0

    move-object/from16 v11, v16

    move-object/from16 v0, v18

    move/from16 v12, v20

    move/from16 v9, v22

    move-object/from16 v15, v25

    move/from16 v14, v27

    goto/16 :goto_2

    :goto_33
    move-object v1, v0

    .line 269
    :goto_34
    :try_start_29
    invoke-virtual/range {v34 .. v34}, Ll/᩸ܽܺ;->close()V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_e

    goto :goto_35

    :catchall_e
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_35
    throw v1

    .line 250
    :cond_59
    invoke-static {}, Ll/ۨۜۧ;->ܳ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ܶۙ()Ljava/lang/CharSequence;
    .locals 3

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۗ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 168
    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 169
    aget-object v0, v0, v1

    invoke-static {v0}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120bf4

    .line 655
    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "extractDir"

    .line 171
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120bf3

    .line 655
    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/ۨۜۧ;)V
    .locals 0

    .line 988
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    return-void
.end method

.method public final ᩺()Ll/ۨ֡֫;
    .locals 1

    .line 162
    sget-object v0, Ll/ܰ۬ۧ;->᩵:Ll/ۨ֡֫;

    return-object v0
.end method
