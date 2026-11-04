.class public final Ll/֫ܺ᩵;
.super Ljava/lang/Object;
.source "M6EB"


# static fields
.field public static final ۙ:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 28
    const-class v0, Ll/֫ܺ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/֫ܺ᩵;->ۙ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 13

    .line 43
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 46
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩶ۗ;

    .line 47
    invoke-interface {v1}, Ll/۫᩶ۗ;->getVisibility()Ll/ۤ᩶ۗ;

    move-result-object v2

    sget-object v3, Ll/ۤ᩶ۗ;->֡:Ll/ۤ᩶ۗ;

    if-ne v2, v3, :cond_1

    .line 57
    invoke-interface {v1}, Ll/۫᩶ۗ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "Ldalvik/annotation/Signature;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x4

    goto :goto_1

    :sswitch_1
    const-string v3, "Ldalvik/annotation/MethodParameters;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x3

    goto :goto_1

    :sswitch_2
    const-string v3, "Ldalvik/annotation/Throws;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v6, 0x2

    goto :goto_1

    :sswitch_3
    const-string v3, "Ldalvik/annotation/AnnotationDefault;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v6, 0x1

    goto :goto_1

    :sswitch_4
    const-string v3, "Ldalvik/annotation/InnerClass;"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    const/4 v6, 0x0

    :goto_1
    const-string v2, "Failed to parse annotation: {}"

    const-string v3, "accessFlags"

    sget-object v7, Ll/֫ܺ᩵;->ۙ:Ll/᩻ܽ᩺;

    const/4 v8, 0x0

    packed-switch v6, :pswitch_data_0

    goto :goto_0

    .line 59
    :pswitch_0
    new-instance v2, Ll/ܰ᩶ۗ;

    .line 136
    invoke-interface {v1}, Ll/۫᩶ۗ;->ᩴ()Ll/ܳ᩶ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 137
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v5, :cond_7

    .line 138
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۗ;

    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_3

    .line 140
    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ᩶ۗ;

    .line 142
    invoke-virtual {v4}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 144
    :cond_8
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 59
    :goto_3
    invoke-direct {v2, v1}, Ll/ܰ᩶ۗ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_1
    :try_start_0
    const-string v5, "names"

    .line 102
    invoke-static {v1, v5}, Ll/ܽ᩻ۤ;->ۙ(Ll/۫᩶ۗ;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 103
    invoke-static {v1, v3}, Ll/ܽ᩻ۤ;->ۙ(Ll/۫᩶ۗ;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 104
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    if-ne v6, v9, :cond_1

    .line 105
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 106
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    if-ge v4, v6, :cond_a

    .line 109
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܳ᩶ۗ;

    .line 110
    invoke-virtual {v10}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v11

    sget-object v12, Ll/᩸᩶ۗ;->ᩴۙ:Ll/᩸᩶ۗ;

    if-ne v11, v12, :cond_9

    .line 111
    invoke-virtual {v10}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_5

    :cond_9
    move-object v10, v8

    .line 112
    :goto_5
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܳ᩶ۗ;

    invoke-virtual {v11}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 113
    new-instance v12, Ll/᩺᩶ۗ;

    invoke-direct {v12, v11, v10}, Ll/᩺᩶ۗ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 115
    :cond_a
    new-instance v3, Ll/ۘ᩶ۗ;

    invoke-direct {v3, v9}, Ll/ۘ᩶ۗ;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v3

    .line 118
    invoke-interface {v7, v2, v1, v3}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 87
    :pswitch_2
    :try_start_1
    invoke-interface {v1}, Ll/۫᩶ۗ;->ᩴ()Ll/ܳ᩶ۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 89
    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 90
    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/֨ۙ᩺;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Ll/֨ۙ᩺;-><init>(I)V

    .line 91
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 92
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 93
    new-instance v2, Ll/᩵᩶ۗ;

    invoke-direct {v2, v1}, Ll/᩵᩶ۗ;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    const-string v2, "Failed to convert dalvik throws annotation"

    .line 96
    invoke-interface {v7, v2, v1}, Ll/᩻ܽ᩺;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 78
    :pswitch_3
    invoke-interface {v1}, Ll/۫᩶ۗ;->ᩴ()Ll/ܳ᩶ۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 79
    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v2

    sget-object v3, Ll/᩸᩶ۗ;->᩶:Ll/᩸᩶ۗ;

    if-ne v2, v3, :cond_1

    .line 80
    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩶ۗ;

    .line 81
    new-instance v2, Ll/ܶ᩶ۗ;

    invoke-interface {v1}, Ll/۫᩶ۗ;->᩷()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v2, v1}, Ll/ܶ᩶ۗ;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    :try_start_2
    const-string v5, "name"

    .line 64
    sget-object v6, Ll/᩸᩶ۗ;->ᩴۙ:Ll/᩸᩶ۗ;

    invoke-static {v1, v5, v6, v8}, Ll/ܽ᩻ۤ;->ۙ(Ll/۫᩶ۗ;Ljava/lang/String;Ll/᩸᩶ۗ;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 65
    sget-object v6, Ll/᩸᩶ۗ;->۠:Ll/᩸᩶ۗ;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v3, v6, v4}, Ll/ܽ᩻ۤ;->ۙ(Ll/۫᩶ۗ;Ljava/lang/String;Ll/᩸᩶ۗ;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v5, :cond_b

    if-eqz v3, :cond_1

    .line 125
    :cond_b
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۫᩶ۗ;

    .line 126
    invoke-interface {v6}, Ll/۫᩶ۗ;->getVisibility()Ll/ۤ᩶ۗ;

    move-result-object v9

    sget-object v10, Ll/ۤ᩶ۗ;->֡:Ll/ۤ᩶ۗ;

    if-ne v9, v10, :cond_c

    .line 127
    invoke-interface {v6}, Ll/۫᩶ۗ;->ܳ()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Ldalvik/annotation/EnclosingClass;"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    const-string v4, "value"

    .line 128
    sget-object v9, Ll/᩸᩶ۗ;->ܳۙ:Ll/᩸᩶ۗ;

    invoke-static {v6, v4, v9, v8}, Ll/ܽ᩻ۤ;->ۙ(Ll/۫᩶ۗ;Ljava/lang/String;Ll/᩸᩶ۗ;Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    .line 69
    :cond_d
    new-instance v4, Ll/ۛ᩶ۗ;

    invoke-direct {v4, p0, v3, v8, v5}, Ll/ۛ᩶ۗ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 70
    new-instance v3, Ll/ۨ᩶ۗ;

    invoke-static {p0, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/ۨ᩶ۗ;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v3

    .line 73
    invoke-interface {v7, v2, v1, v3}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 51
    :cond_e
    invoke-static {p2}, Ll/ۗ᩶ۗ;->ۙ(Ljava/util/List;)Ll/ۗ᩶ۗ;

    move-result-object p0

    if-eqz p0, :cond_f

    .line 21
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_6
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x71f1656d -> :sswitch_4
        -0x41d6d9b1 -> :sswitch_3
        -0x33317c98 -> :sswitch_2
        0x4fcf134a -> :sswitch_1
        0x63354869 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-static {v0, p0, p1}, Ll/֫ܺ᩵;->ۙ(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    return-void
.end method

.method public static ᩷(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 0

    .line 31
    invoke-static {p0, p1, p2}, Ll/֫ܺ᩵;->ۙ(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    return-void
.end method

.method public static ᩷(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-static {v0, p0, p1}, Ll/֫ܺ᩵;->ۙ(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    return-void
.end method
