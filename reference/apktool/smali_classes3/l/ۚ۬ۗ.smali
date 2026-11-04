.class public final Ll/ۚ۬ۗ;
.super Ll/ܺ۠ۗ;
.source "Z6EN"


# static fields
.field public static final synthetic ܰ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Ll/ۚ۬ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ۖۡۗ;Ll/ܽᩳۗ;Ll/᩷ۡۗ;Ll/᩶ۢۗ;)V
    .locals 8

    .line 88
    invoke-virtual {p3}, Ll/ܽᩳۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v0

    .line 459
    invoke-virtual {v0}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object v0

    const/4 v1, 0x0

    .line 108
    :try_start_0
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 110
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۢۙ()I

    move-result v2

    new-array v3, v2, [Ll/ܺ֨ۗ;

    .line 111
    invoke-virtual {p3}, Ll/ܽᩳۗ;->ۙ()[I

    move-result-object v4

    const/4 v5, 0x0

    .line 112
    :goto_0
    array-length v6, v4

    if-ge v5, v6, :cond_0

    .line 113
    invoke-virtual {p5, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    .line 114
    aget v7, v4, v5

    aput-object v6, v3, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 117
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 118
    invoke-virtual {v0, v4}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 119
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۛ֨ۗ;

    .line 120
    invoke-virtual {v5}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "\' in method call: "

    if-lt v6, v2, :cond_2

    .line 122
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown register number \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 125
    :cond_2
    aget-object v6, v3, v6

    if-nez v6, :cond_3

    .line 127
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not passed register \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 130
    :cond_3
    invoke-virtual {v6}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to replace arg "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for method inline: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_4

    .line 136
    :cond_4
    invoke-virtual {p5}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 138
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    goto :goto_3

    .line 139
    :cond_5
    invoke-virtual {p3}, Ll/ܽᩳۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v2

    .line 151
    invoke-virtual {p5}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_6

    goto :goto_1

    .line 154
    :cond_6
    sget-object v3, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p5, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    .line 157
    :cond_7
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->᩻ۙ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_8

    :goto_1
    const/4 v2, 0x0

    goto :goto_2

    .line 160
    :cond_8
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܺ᩷()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    :goto_2
    if-eqz v2, :cond_9

    .line 141
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v2

    const-string v3, "unused"

    .line 569
    invoke-virtual {p1, v2}, Ll/ۖۡۗ;->ۙ(Ll/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v2

    .line 570
    invoke-virtual {v2, v3}, Ll/ۛ֨ۗ;->setName(Ljava/lang/String;)V

    .line 141
    invoke-virtual {v0, v2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_9
    :goto_3
    const/4 v1, 0x1

    goto :goto_4

    :catch_0
    move-exception v2

    const-string v3, "Method inline failed with exception"

    .line 145
    invoke-virtual {p1, v3, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    if-eqz v1, :cond_b

    .line 90
    sget-object v1, Ll/ۧ۟ۗ;->֡:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/᩶ۡۗ;

    .line 92
    invoke-static {p1, p4, p5, v0}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result p4

    if-eqz p4, :cond_b

    if-eqz v1, :cond_a

    .line 94
    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 96
    :cond_a
    invoke-virtual {p3}, Ll/ܽᩳۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object p3

    .line 164
    new-instance p4, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object p5

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 165
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 166
    invoke-virtual {p2, p4}, Ll/ۖۡۗ;->ۤ(Ljava/util/List;)V

    .line 167
    new-instance p4, Ll/ᩴ۬ۗ;

    invoke-direct {p4, p0, p1, p2}, Ll/ᩴ۬ۗ;-><init>(Ll/ۚ۬ۗ;Ll/ۖۡۗ;Ll/ۖۡۗ;)V

    invoke-virtual {p3, p4}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    return-void

    .line 100
    :cond_b
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to inline method: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 102
    invoke-static {p1, v0}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 103
    invoke-virtual {p5}, Ll/ᩳۡۗ;->ۗۙ()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 10

    .line 44
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 47
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 48
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۡۗ;

    .line 49
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    sget-object v4, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v3, v4, :cond_2

    .line 50
    move-object v7, v2

    check-cast v7, Ll/᩶ۢۗ;

    const-string v2, "Failed to check method for inline after forced process"

    const-string v3, "Class process forced to load method for inline: "

    .line 57
    sget-object v4, Ll/ۧ۟ۗ;->֡:Ll/ۧ۟ۗ;

    invoke-virtual {v7, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/᩶ۡۗ;

    .line 58
    instance-of v5, v4, Ll/ۖۡۗ;

    if-nez v5, :cond_3

    goto :goto_0

    .line 61
    :cond_3
    move-object v9, v4

    check-cast v9, Ll/ۖۡۗ;

    .line 63
    :try_start_0
    invoke-static {v9}, Ll/᩻۬ۗ;->ۤ(Ll/ۖۡۗ;)Ll/ܽᩳۗ;

    move-result-object v4

    if-nez v4, :cond_5

    .line 66
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/֫ۖۗ;->᩻ۙ()Ll/֨ܿۗ;

    move-result-object v3

    invoke-virtual {v9}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;)V

    .line 69
    invoke-static {v9}, Ll/᩻۬ۗ;->ۤ(Ll/ۖۡۗ;)Ll/ܽᩳۗ;

    move-result-object v3

    if-nez v3, :cond_4

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v5, v3

    goto :goto_1

    :cond_5
    move-object v5, v4

    .line 75
    :goto_1
    invoke-virtual {v5}, Ll/ܽᩳۗ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    .line 78
    :cond_6
    invoke-virtual {v5}, Ll/ܽᩳۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v2

    .line 204
    new-instance v3, Ll/ܳ۬ۗ;

    invoke-direct {v3, p1}, Ll/ܳ۬ۗ;-><init>(Ll/ۖۡۗ;)V

    invoke-virtual {v2, v3}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-nez v2, :cond_7

    const/4 v2, 0x1

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_8

    goto/16 :goto_0

    :cond_8
    move-object v2, p0

    move-object v3, p1

    move-object v4, v9

    move-object v6, v1

    .line 81
    invoke-direct/range {v2 .. v7}, Ll/ۚ۬ۗ;->ۙ(Ll/ۖۡۗ;Ll/ۖۡۗ;Ll/ܽᩳۗ;Ll/᩷ۡۗ;Ll/᩶ۢۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 83
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to process method for inline: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    throw v0

    :cond_9
    :goto_3
    return-void
.end method
