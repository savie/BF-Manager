.class public final Ll/ۜᩴܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ljava/util/ArrayList;

.field public final ֨:Ljava/io/DataInput;

.field public ۖ:[Ll/ۛܳܳ;

.field public ۙۙ:[Z

.field public final ۜ:Ll/ۖᩴܳ;

.field public final ۟:Ljava/util/ArrayList;

.field public ۠:J

.field public final ۡ:[Ll/᩵۫ܳ;

.field public ۢ:[Ll/۬۫ܳ;

.field public ۬:Z

.field public final ܰ:Ll/ᩳᩴܳ;

.field public final ܿ:Ll/۫۫ܳ;

.field public ᩳ:Ll/ۡᩴܳ;

.field public final ᩶:Ll/᩻ܳܳ;


# direct methods
.method public constructor <init>(Ll/۫۫ܳ;Ljava/io/DataInput;[Ll/᩵۫ܳ;Ll/ۖᩴܳ;Ll/ᩳᩴܳ;)V
    .locals 2

    .line 2829
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2815
    new-instance v0, Ll/᩻ܳܳ;

    invoke-direct {v0}, Ll/᩻ܳܳ;-><init>()V

    iput-object v0, p0, Ll/ۜᩴܳ;->᩶:Ll/᩻ܳܳ;

    .line 2816
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜᩴܳ;->֡:Ljava/util/ArrayList;

    .line 2817
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜᩴܳ;->۟:Ljava/util/ArrayList;

    const/4 v0, 0x0

    new-array v1, v0, [Ll/۬۫ܳ;

    .line 2818
    iput-object v1, p0, Ll/ۜᩴܳ;->ۢ:[Ll/۬۫ܳ;

    new-array v1, v0, [Z

    .line 2819
    iput-object v1, p0, Ll/ۜᩴܳ;->ۙۙ:[Z

    new-array v0, v0, [Ll/ۛܳܳ;

    .line 2820
    iput-object v0, p0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    .line 2830
    iput-object p1, p0, Ll/ۜᩴܳ;->ܿ:Ll/۫۫ܳ;

    .line 2831
    iput-object p2, p0, Ll/ۜᩴܳ;->֨:Ljava/io/DataInput;

    .line 2832
    iput-object p3, p0, Ll/ۜᩴܳ;->ۡ:[Ll/᩵۫ܳ;

    .line 2833
    iput-object p4, p0, Ll/ۜᩴܳ;->ۜ:Ll/ۖᩴܳ;

    .line 2834
    iput-object p5, p0, Ll/ۜᩴܳ;->ܰ:Ll/ᩳᩴܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۜᩴܳ;)Ll/᩻ܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜᩴܳ;->᩶:Ll/᩻ܳܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۜᩴܳ;)[Ll/ۛܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 3108
    iget-boolean v0, p0, Ll/ۜᩴܳ;->۬:Z

    if-eqz v0, :cond_0

    goto :goto_3

    .line 3112
    :cond_0
    iget-object v0, p0, Ll/ۜᩴܳ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    if-ltz v1, :cond_2

    .line 3114
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛܳܳ;

    invoke-virtual {v4}, Ll/ۛܳܳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    if-nez v3, :cond_1

    move-object v3, v4

    goto :goto_1

    .line 3119
    :cond_1
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 3123
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3124
    iget-object v0, p0, Ll/ۜᩴܳ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3125
    iget-object v0, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    if-eqz v0, :cond_4

    .line 3127
    :try_start_1
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    if-nez v3, :cond_3

    move-object v3, v0

    goto :goto_2

    .line 3132
    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 3135
    :goto_2
    iput-object v2, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    :cond_4
    if-nez v3, :cond_5

    :goto_3
    return-void

    .line 3138
    :cond_5
    invoke-static {v3}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final ۙ(III)Ll/۬۫ܳ;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    if-ltz v2, :cond_f

    if-nez v1, :cond_0

    if-nez v2, :cond_f

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_f

    if-gt v2, v1, :cond_f

    :goto_0
    int-to-long v3, v2

    .line 2916
    invoke-static {v3, v4}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v3

    const-wide/32 v5, 0x4000000

    cmp-long v7, v3, v5

    if-gtz v7, :cond_e

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_c

    .line 2923
    iget-object v7, v0, Ll/ۜᩴܳ;->֨:Ljava/io/DataInput;

    invoke-interface {v7}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v8

    int-to-long v9, v1

    sub-long/2addr v9, v4

    long-to-int v10, v9

    .line 2927
    iget-object v9, v0, Ll/ۜᩴܳ;->ۡ:[Ll/᩵۫ܳ;

    const/4 v11, 0x1

    iget-object v12, v0, Ll/ۜᩴܳ;->ܰ:Ll/ᩳᩴܳ;

    if-ne v8, v11, :cond_2

    .line 2928
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v8

    .line 2929
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v11

    .line 2930
    invoke-static {v11, v10}, Ll/ᩳܳܳ;->ۙ(II)V

    int-to-long v13, v8

    int-to-long v1, v11

    add-long/2addr v13, v1

    if-ltz v8, :cond_1

    .line 2932
    iget-object v1, v0, Ll/ۜᩴܳ;->ܿ:Ll/۫۫ܳ;

    invoke-virtual {v1}, Ll/۫۫ܳ;->length()I

    move-result v2

    move-wide v15, v4

    int-to-long v4, v2

    cmp-long v2, v13, v4

    if-gtz v2, :cond_1

    const-wide/16 v4, 0x1

    .line 2936
    invoke-static {v4, v5}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v4

    .line 2935
    invoke-virtual {v12, v4, v5}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2937
    invoke-static {v7, v8, v11, v9, v12}, Ll/ۢ۫ܳ;->ۙ(Ljava/io/DataInput;II[Ll/᩵۫ܳ;Ll/ᩳᩴܳ;)Ll/ۢ۫ܳ;

    move-result-object v2

    .line 2939
    new-instance v4, Ll/۠۫ܳ;

    invoke-direct {v4, v1, v8, v11, v2}, Ll/۠۫ܳ;-><init>(Ll/᩸۫ܳ;IILl/ۢ۫ܳ;)V

    invoke-static {v4}, Ll/ᩴۚܳ;->ۙ(Ll/۠۫ܳ;)Ll/۬۫ܳ;

    move-result-object v1

    goto/16 :goto_3

    :cond_1
    const-string v1, "BASE range is outside source"

    .line 2933
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_2
    move-wide v15, v4

    const-wide/16 v1, 0x1

    const/4 v4, 0x2

    if-ne v8, v4, :cond_6

    .line 2942
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v1

    if-ltz v1, :cond_5

    .line 2943
    iget-object v2, v0, Ll/ۜᩴܳ;->ۢ:[Ll/۬۫ܳ;

    array-length v4, v2

    if-ge v1, v4, :cond_5

    .line 2946
    aget-object v2, v2, v1

    if-nez v2, :cond_3

    const/4 v4, 0x0

    goto :goto_2

    .line 45
    :cond_3
    iget v4, v2, Ll/۬۫ܳ;->۫:I

    .line 2948
    :goto_2
    invoke-static {v4, v10}, Ll/ᩳܳܳ;->ۙ(II)V

    .line 2949
    iget-object v5, v0, Ll/ۜᩴܳ;->ۙۙ:[Z

    aget-boolean v5, v5, v1

    if-eqz v5, :cond_4

    .line 2951
    invoke-static {v2}, Ll/ᩴۚܳ;->ܽ(Ll/۬۫ܳ;)J

    move-result-wide v7

    .line 2950
    invoke-virtual {v12, v7, v8}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2953
    :cond_4
    iget-object v5, v0, Ll/ۜᩴܳ;->ۙۙ:[Z

    aput-boolean v11, v5, v1

    move/from16 v10, p3

    goto/16 :goto_4

    :cond_5
    const-string v1, "Invalid delta identity"

    .line 2944
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_6
    const/4 v4, 0x3

    if-ne v8, v4, :cond_7

    .line 2955
    invoke-interface {v7}, Ljava/io/DataInput;->readByte()B

    move-result v4

    .line 2956
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v11

    .line 2957
    invoke-static {v11, v10}, Ll/ᩳܳܳ;->ۙ(II)V

    .line 2959
    invoke-static {v1, v2}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v1

    .line 2958
    invoke-virtual {v12, v1, v2}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2960
    new-instance v1, Ll/ܽܳܳ;

    invoke-direct {v1, v4, v11}, Ll/ܽܳܳ;-><init>(BI)V

    invoke-static {v1}, Ll/ᩴۚܳ;->ۙ(Ll/᩸۫ܳ;)Ll/۬۫ܳ;

    move-result-object v1

    goto :goto_3

    :cond_7
    const/4 v4, 0x5

    if-ne v8, v4, :cond_9

    .line 2963
    invoke-interface {v7}, Ljava/io/DataInput;->readByte()B

    move-result v4

    .line 2964
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v11

    .line 2965
    invoke-static {v11, v10}, Ll/ᩳܳܳ;->ۙ(II)V

    .line 2967
    invoke-static {v1, v2}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v1

    .line 2966
    invoke-virtual {v12, v1, v2}, Ll/ᩳᩴܳ;->ۙ(J)V

    const/4 v1, 0x0

    .line 2968
    invoke-static {v7, v1, v11, v9, v12}, Ll/ۢ۫ܳ;->ۙ(Ljava/io/DataInput;II[Ll/᩵۫ܳ;Ll/ᩳᩴܳ;)Ll/ۢ۫ܳ;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 2973
    new-instance v5, Ll/۠۫ܳ;

    new-instance v7, Ll/ܽܳܳ;

    invoke-direct {v7, v4, v11}, Ll/ܽܳܳ;-><init>(BI)V

    invoke-direct {v5, v7, v1, v11, v2}, Ll/۠۫ܳ;-><init>(Ll/᩸۫ܳ;IILl/ۢ۫ܳ;)V

    invoke-static {v5}, Ll/ᩴۚܳ;->ۙ(Ll/۠۫ܳ;)Ll/۬۫ܳ;

    move-result-object v1

    :goto_3
    move/from16 v10, p3

    move-object v2, v1

    move v4, v11

    goto :goto_4

    :cond_8
    const-string v1, "Patched FILL has no patches"

    .line 2971
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_9
    const/4 v4, 0x4

    if-ne v8, v4, :cond_b

    .line 2976
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v4

    .line 2977
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v5

    .line 2978
    invoke-interface {v7}, Ljava/io/DataInput;->readInt()I

    move-result v8

    .line 2979
    invoke-static {v8, v10}, Ll/ᩳܳܳ;->ۙ(II)V

    if-ltz v4, :cond_a

    move/from16 v10, p3

    if-ge v4, v10, :cond_a

    .line 2980
    iget-object v11, v0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    aget-object v11, v11, v4

    if-eqz v11, :cond_a

    if-ltz v5, :cond_a

    int-to-long v13, v5

    int-to-long v1, v8

    add-long/2addr v13, v1

    .line 2984
    invoke-virtual {v11}, Ll/ۛܳܳ;->length()I

    move-result v1

    int-to-long v1, v1

    cmp-long v11, v13, v1

    if-gtz v11, :cond_a

    .line 2987
    invoke-static {v7, v5, v8, v9, v12}, Ll/ۢ۫ܳ;->ۙ(Ljava/io/DataInput;II[Ll/᩵۫ܳ;Ll/ᩳᩴܳ;)Ll/ۢ۫ܳ;

    move-result-object v1

    const-wide/16 v13, 0x1

    .line 2990
    invoke-static {v13, v14}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v13

    .line 2989
    invoke-virtual {v12, v13, v14}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2991
    new-instance v2, Ll/۠۫ܳ;

    iget-object v7, v0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    aget-object v4, v7, v4

    invoke-direct {v2, v4, v5, v8, v1}, Ll/۠۫ܳ;-><init>(Ll/᩸۫ܳ;IILl/ۢ۫ܳ;)V

    invoke-static {v2}, Ll/ᩴۚܳ;->ۙ(Ll/۠۫ܳ;)Ll/۬۫ܳ;

    move-result-object v2

    move v4, v8

    .line 2996
    :goto_4
    invoke-static {v3, v2}, Ll/ᩴۚܳ;->᩸(Ll/۬۫ܳ;Ll/۬۫ܳ;)Ll/۬۫ܳ;

    move-result-object v3

    int-to-long v1, v4

    add-long v4, v15, v1

    add-int/lit8 v6, v6, 0x1

    move/from16 v1, p1

    move/from16 v2, p2

    goto/16 :goto_1

    :cond_a
    const-string v1, "Invalid replacement recipe extent"

    .line 2985
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_b
    const-string v1, "Unknown extent tag "

    .line 0
    invoke-static {v8, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2994
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_c
    move-wide v15, v4

    int-to-long v1, v1

    cmp-long v4, v15, v1

    if-nez v4, :cond_d

    return-object v3

    :cond_d
    const-string v1, "Extent lengths do not match document length"

    .line 3000
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_e
    const-string v1, "Span structure exceeds memory limit"

    .line 2918
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_f
    const-string v1, "Invalid extent count"

    .line 2914
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1
.end method

.method public final ۙ()V
    .locals 1

    .line 3080
    iget-object v0, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    if-eqz v0, :cond_0

    .line 3081
    invoke-interface {v0}, Ll/ۡᩴܳ;->finish()V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/۬۫ܳ;)V
    .locals 4

    .line 3007
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3008
    invoke-static {p1, v0}, Ll/ᩳܳܳ;->ۙ(Ll/۬۫ܳ;Ljava/util/ArrayList;)V

    .line 3009
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 3010
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1, v0}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 3011
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 3012
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛܳܳ;

    .line 3013
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v2, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 3016
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3017
    invoke-static {v2}, Ll/ۛܳܳ;->ۤ(Ll/ۛܳܳ;)Ll/۬۫ܳ;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ᩳܳܳ;->ۙ(Ll/۬۫ܳ;Ljava/util/ArrayList;)V

    .line 3018
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛܳܳ;

    .line 3019
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_1

    .line 3022
    :cond_2
    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->size()I

    move-result p1

    iget-object v0, p0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    array-length v0, v0

    if-ne p1, v0, :cond_5

    .line 3025
    iget-object p1, p0, Ll/ۜᩴܳ;->ۙۙ:[Z

    array-length v0, p1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_4

    aget-boolean v2, p1, v1

    if-eqz v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    const-string p1, "Unreachable delta definition"

    .line 3027
    invoke-static {p1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    return-void

    :cond_5
    const-string p1, "Unreachable replacement recipe definition"

    .line 3023
    invoke-static {p1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1
.end method

.method public final ۙ(Ll/ᩳܳܳ;)V
    .locals 6

    .line 3087
    iget-boolean v0, p0, Ll/ۜᩴܳ;->۬:Z

    if-nez v0, :cond_3

    .line 3090
    iget-object v0, p0, Ll/ۜᩴܳ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸۫ܳ;

    .line 3091
    invoke-static {p1}, Ll/ᩳܳܳ;->۫(Ll/ᩳܳܳ;)Ljava/util/IdentityHashMap;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v2, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 3093
    :cond_0
    iget-object v1, p0, Ll/ۜᩴܳ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛܳܳ;

    .line 3094
    invoke-static {p1}, Ll/ᩳܳܳ;->۫(Ll/ᩳܳܳ;)Ljava/util/IdentityHashMap;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4, v3, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 3096
    :cond_1
    iget-object p1, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    if-eqz p1, :cond_2

    .line 3097
    invoke-interface {p1}, Ll/ۡᩴܳ;->ۤۙ()V

    .line 3099
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3100
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    .line 3101
    iput-object p1, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    const/4 p1, 0x1

    .line 3102
    iput-boolean p1, p0, Ll/ۜᩴܳ;->۬:Z

    return-void

    .line 3088
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Checkpoint sources already transferred"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۤ()V
    .locals 32

    move-object/from16 v0, p0

    .line 2858
    iget-object v1, v0, Ll/ۜᩴܳ;->֨:Ljava/io/DataInput;

    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v2

    if-ltz v2, :cond_a

    const/high16 v3, 0x100000

    if-gt v2, v3, :cond_a

    int-to-long v4, v2

    const-wide/16 v6, 0x18

    mul-long v4, v4, v6

    const-wide/16 v6, 0x10

    add-long/2addr v6, v4

    .line 2862
    iget-object v8, v0, Ll/ۜᩴܳ;->ܰ:Ll/ᩳᩴܳ;

    invoke-virtual {v8, v6, v7}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2865
    iget-object v6, v0, Ll/ۜᩴܳ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 2867
    iput-wide v4, v0, Ll/ۜᩴܳ;->۠:J

    const-string v7, "Replacement recipe table exceeds memory limit"

    const-wide/32 v9, 0x4000000

    cmp-long v11, v4, v9

    if-gtz v11, :cond_9

    .line 2872
    new-array v4, v2, [Ll/ۛܳܳ;

    iput-object v4, v0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_8

    .line 2874
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v13

    .line 2875
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v14

    .line 2876
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v15

    .line 2877
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v5

    if-ltz v13, :cond_7

    if-lez v14, :cond_7

    if-lez v15, :cond_7

    if-ltz v5, :cond_7

    int-to-long v11, v5

    cmp-long v16, v11, v9

    if-gtz v16, :cond_7

    .line 2883
    iget-wide v9, v0, Ll/ۜᩴܳ;->۠:J

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    const-wide/16 v6, 0x40

    move/from16 v16, v14

    move/from16 v17, v15

    .line 2884
    invoke-static {v11, v12, v6, v7}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v14

    .line 2883
    invoke-static {v9, v10, v14, v15}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v9

    iput-wide v9, v0, Ll/ۜᩴܳ;->۠:J

    const-wide/32 v14, 0x4000000

    cmp-long v22, v9, v14

    if-gtz v22, :cond_6

    .line 2889
    invoke-static {v11, v12, v6, v7}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v6

    invoke-virtual {v8, v6, v7}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2891
    new-array v5, v5, [B

    .line 2892
    invoke-interface {v1, v5}, Ljava/io/DataInput;->readFully([B)V

    .line 5571
    invoke-interface {v1}, Ljava/io/DataInput;->readInt()I

    move-result v6

    if-lez v6, :cond_5

    if-gt v6, v3, :cond_5

    .line 5575
    invoke-static {v6}, Ll/ᩳܳܳ;->ۙ(I)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 5576
    new-array v3, v6, [Ll/֡۫ܳ;

    .line 5577
    new-array v7, v6, [J

    const-wide/16 v9, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    move-wide v14, v9

    :goto_1
    if-ge v12, v6, :cond_3

    move/from16 v29, v2

    const/4 v2, 0x0

    move-object/from16 v30, v5

    .line 5582
    invoke-static {v1, v2, v8}, Ll/֡۫ܳ;->ۙ(Ljava/io/DataInput;ILl/ᩳᩴܳ;)Ll/֡۫ܳ;

    move-result-object v5

    .line 5584
    invoke-virtual {v5, v2}, Ll/֡۫ܳ;->ۤ(I)I

    move-result v2

    if-ltz v2, :cond_2

    if-eqz v12, :cond_0

    if-le v2, v11, :cond_2

    .line 5588
    :cond_0
    invoke-virtual {v5}, Ll/֡۫ܳ;->ۤ()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v5, v2}, Ll/֡۫ܳ;->ۤ(I)I

    move-result v11

    move-object/from16 v31, v1

    .line 5590
    invoke-virtual {v5}, Ll/֡۫ܳ;->ۙ()J

    move-result-wide v1

    .line 5589
    invoke-static {v9, v10, v1, v2}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v9

    .line 5591
    invoke-static {v6, v9, v10}, Ll/ᩳܳܳ;->ۙ(IJ)J

    move-result-wide v1

    const-wide/32 v18, 0x4000000

    cmp-long v22, v1, v18

    if-gtz v22, :cond_1

    .line 5596
    invoke-virtual {v5}, Ll/֡۫ܳ;->ۤ()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v14, v15, v1, v2}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v14

    .line 5597
    aput-object v5, v3, v12

    .line 5598
    aput-wide v14, v7, v12

    add-int/lit8 v12, v12, 0x1

    move/from16 v2, v29

    move-object/from16 v5, v30

    move-object/from16 v1, v31

    goto :goto_1

    :cond_1
    const-string v1, "Replacement recipe index exceeds memory limit"

    .line 5594
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_2
    const-string v1, "Replacement recipe starts are not sorted"

    .line 5586
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_3
    move-object/from16 v31, v1

    move/from16 v29, v2

    move-object/from16 v30, v5

    .line 5600
    new-instance v1, Ll/ۗܳܳ;

    .line 5601
    invoke-static {v6, v9, v10}, Ll/ᩳܳܳ;->ۙ(IJ)J

    move-result-wide v27

    move-object/from16 v22, v1

    move-object/from16 v23, v3

    move-object/from16 v24, v7

    move-wide/from16 v25, v14

    invoke-direct/range {v22 .. v28}, Ll/ۗܳܳ;-><init>([Ll/֡۫ܳ;[JJJ)V

    .line 2894
    iget-wide v2, v0, Ll/ۜᩴܳ;->۠:J

    .line 2895
    invoke-virtual {v1}, Ll/ۗܳܳ;->ۙ()J

    move-result-wide v5

    .line 2894
    invoke-static {v2, v3, v5, v6}, Ll/ᩳܳܳ;->ۙ(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۜᩴܳ;->۠:J

    const-wide/32 v5, 0x4000000

    cmp-long v7, v2, v5

    if-gtz v7, :cond_4

    .line 2899
    invoke-interface/range {v31 .. v31}, Ljava/io/DataInput;->readInt()I

    move-result v2

    .line 2900
    invoke-virtual {v0, v13, v2, v4}, Ll/ۜᩴܳ;->ۙ(III)Ll/۬۫ܳ;

    move-result-object v12

    .line 2901
    new-instance v2, Ll/ۛܳܳ;

    move-object v11, v2

    move/from16 v14, v16

    move/from16 v15, v17

    move-object/from16 v16, v30

    move-object/from16 v17, v1

    invoke-direct/range {v11 .. v17}, Ll/ۛܳܳ;-><init>(Ll/۬۫ܳ;III[BLl/ۗܳܳ;)V

    .line 2904
    iget-object v1, v0, Ll/ۜᩴܳ;->ۖ:[Ll/ۛܳܳ;

    aput-object v2, v1, v4

    move-object/from16 v1, v20

    .line 2905
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    const/high16 v3, 0x100000

    move-wide v9, v5

    move-object/from16 v7, v21

    move/from16 v2, v29

    move-object v6, v1

    move-object/from16 v1, v31

    goto/16 :goto_0

    .line 2897
    :cond_4
    invoke-static/range {v21 .. v21}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_5
    const-string v1, "Invalid replacement recipe index size"

    .line 5573
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    .line 2887
    :cond_6
    invoke-static/range {v21 .. v21}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_7
    const-string v1, "Invalid replacement recipe header"

    .line 2881
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_8
    return-void

    :cond_9
    move-object/from16 v21, v7

    .line 2870
    invoke-static/range {v21 .. v21}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1

    :cond_a
    const-string v1, "Invalid recipe table size"

    .line 2860
    invoke-static {v1}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v1

    throw v1
.end method

.method public final ᩷()V
    .locals 15

    .line 2839
    iget-object v0, p0, Ll/ۜᩴܳ;->֨:Ljava/io/DataInput;

    invoke-interface {v0}, Ljava/io/DataInput;->readInt()I

    move-result v1

    if-ltz v1, :cond_8

    const/high16 v2, 0x100000

    if-gt v1, v2, :cond_8

    int-to-long v2, v1

    .line 2844
    invoke-static {v2, v3}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v2

    iget-object v4, p0, Ll/ۜᩴܳ;->ܰ:Ll/ᩳᩴܳ;

    invoke-virtual {v4, v2, v3}, Ll/ᩳᩴܳ;->ۙ(J)V

    .line 2845
    new-array v2, v1, [Ll/۬۫ܳ;

    iput-object v2, p0, Ll/ۜᩴܳ;->ۢ:[Ll/۬۫ܳ;

    .line 2846
    new-array v2, v1, [Z

    iput-object v2, p0, Ll/ۜᩴܳ;->ۙۙ:[Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_7

    .line 2848
    invoke-interface {v0}, Ljava/io/DataInput;->readInt()I

    move-result v5

    if-lez v5, :cond_6

    .line 2852
    iget-object v6, p0, Ll/ۜᩴܳ;->ۢ:[Ll/۬۫ܳ;

    const/high16 v7, 0x10000

    .line 3034
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v7

    new-array v8, v7, [B

    const/4 v9, 0x0

    .line 3035
    iget-object v10, p0, Ll/ۜᩴܳ;->ۜ:Ll/ۖᩴܳ;

    if-nez v10, :cond_1

    int-to-long v10, v5

    const-wide/32 v12, 0xffff

    add-long/2addr v10, v12

    const-wide/32 v12, 0x10000

    .line 3036
    div-long/2addr v10, v12

    const-wide/16 v12, 0x1

    cmp-long v14, v10, v12

    if-lez v14, :cond_0

    sub-long/2addr v10, v12

    .line 3040
    invoke-static {v10, v11}, Ll/ᩴۚܳ;->ۙ(J)J

    move-result-wide v10

    .line 3039
    invoke-virtual {v4, v10, v11}, Ll/ᩳᩴܳ;->ۙ(J)V

    :cond_0
    :goto_1
    if-lez v5, :cond_4

    .line 3045
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 3046
    invoke-interface {v0, v8, v2, v10}, Ljava/io/DataInput;->readFully([BII)V

    .line 3047
    iget-object v11, p0, Ll/ۜᩴܳ;->᩶:Ll/᩻ܳܳ;

    invoke-virtual {v11, v10, v8}, Ll/᩻ܳܳ;->ۙ(I[B)Ll/۬۫ܳ;

    move-result-object v11

    invoke-static {v9, v11}, Ll/ᩴۚܳ;->᩸(Ll/۬۫ܳ;Ll/۬۫ܳ;)Ll/۬۫ܳ;

    move-result-object v9

    sub-int/2addr v5, v10

    goto :goto_1

    .line 3052
    :cond_1
    iget-object v11, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    if-nez v11, :cond_2

    .line 3054
    invoke-interface {v10}, Ll/ۖᩴܳ;->create()Ll/ۡᩴܳ;

    move-result-object v10

    .line 3053
    iput-object v10, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    .line 3057
    :cond_2
    iget-object v10, p0, Ll/ۜᩴܳ;->ᩳ:Ll/ۡᩴܳ;

    .line 3058
    invoke-interface {v10, v5}, Ll/ۡᩴܳ;->ᩴ(I)Ll/ۢᩴܳ;

    move-result-object v10

    move v11, v5

    :goto_2
    if-lez v11, :cond_3

    .line 3062
    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 3063
    invoke-interface {v0, v8, v2, v12}, Ljava/io/DataInput;->readFully([BII)V

    .line 3064
    invoke-interface {v10, v12, v8}, Ll/ۢᩴܳ;->ۙ(I[B)V

    sub-int/2addr v11, v12

    goto :goto_2

    .line 3067
    :cond_3
    invoke-interface {v10}, Ll/ۢᩴܳ;->finish()V

    .line 3068
    invoke-interface {v10}, Ll/ۢᩴܳ;->position()I

    move-result v7

    if-ne v7, v5, :cond_5

    .line 3072
    invoke-interface {v10}, Ll/ۢᩴܳ;->ۙ()Ll/᩸۫ܳ;

    move-result-object v7

    const-string v8, "checkpoint delta source"

    .line 3071
    invoke-static {v7, v8}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3073
    iget-object v8, p0, Ll/ۜᩴܳ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3074
    new-instance v8, Ll/۠۫ܳ;

    invoke-direct {v8, v7, v2, v5, v9}, Ll/۠۫ܳ;-><init>(Ll/᩸۫ܳ;IILl/ۢ۫ܳ;)V

    invoke-static {v8}, Ll/ᩴۚܳ;->ۙ(Ll/۠۫ܳ;)Ll/۬۫ܳ;

    move-result-object v9

    .line 2852
    :cond_4
    aput-object v9, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    const-string v0, "Incomplete delta table payload"

    .line 3069
    invoke-static {v0}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_6
    const-string v0, "Invalid delta table payload length"

    .line 2850
    invoke-static {v0}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_7
    return-void

    :cond_8
    const-string v0, "Invalid delta table size"

    .line 2841
    invoke-static {v0}, Ll/ᩳܳܳ;->ۙ(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
