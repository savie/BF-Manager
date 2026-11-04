.class public final Ll/֨ܿۗ;
.super Ljava/lang/Object;
.source "NIXE"


# static fields
.field public static final ۤ:Ll/ᩴܰۗ;

.field public static final ᩷:Ll/᩻ܽ᩺;


# instance fields
.field public final ۙ:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 36
    const-class v0, Ll/֨ܿۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/֨ܿۗ;->᩷:Ll/᩻ܽ᩺;

    .line 38
    new-instance v0, Ll/ᩴܰۗ;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/ᩴܰۗ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/֨ܿۗ;->ۤ:Ll/ᩴܰۗ;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ll/ܶۘۗ;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 43
    iput-object p1, p0, Ll/֨ܿۗ;->ۙ:Ljava/util/ArrayList;

    return-void
.end method

.method private ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;
    .locals 4

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 48
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getState()Ll/ۜۡۗ;

    move-result-object v0

    sget-object v2, Ll/ۜۡۗ;->۟:Ll/ۜۡۗ;

    if-ne v0, v2, :cond_0

    goto/16 :goto_3

    .line 52
    :cond_0
    invoke-static {}, Ll/ۘۧ᩵;->ۙ()V

    .line 53
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    monitor-enter v0

    .line 55
    :try_start_0
    sget-object v2, Ll/֫۟ۗ;->ۢ:Ll/֫۟ۗ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 56
    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 57
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۙۙ()V

    .line 58
    sget-object v2, Ll/֫۟ۗ;->֨:Ll/֫۟ۗ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 60
    :cond_1
    sget-object v2, Ll/֫۟ۗ;->֨:Ll/֫۟ۗ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 61
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v3

    invoke-virtual {v3, p1}, Ll/֫ۖۗ;->᩷(Ll/᩻ۡۗ;)V

    .line 62
    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 64
    :cond_2
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getState()Ll/ۜۡۗ;

    move-result-object v2

    sget-object v3, Ll/ۜۡۗ;->᩶:Ll/ۜۡۗ;

    if-ne v2, v3, :cond_3

    .line 66
    sget-object v2, Ll/ۜۡۗ;->֡:Ll/ۜۡۗ;

    invoke-virtual {p1, v2}, Ll/᩻ۡۗ;->ۙ(Ll/ۜۡۗ;)V

    :cond_3
    if-eqz p2, :cond_4

    .line 69
    sget-object v2, Ll/ۢۡۗ;->ܿ:Ll/ۢۡۗ;

    .line 70
    sget-object v2, Ll/֫۟ۗ;->۠ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 71
    invoke-virtual {p1, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 72
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۚ᩷()V

    goto :goto_0

    .line 75
    :cond_4
    sget-object v2, Ll/ۢۡۗ;->ܿ:Ll/ۢۡۗ;

    .line 77
    :cond_5
    :goto_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getState()Ll/ۜۡۗ;

    move-result-object v2

    sget-object v3, Ll/ۜۡۗ;->֡:Ll/ۜۡۗ;

    if-ne v2, v3, :cond_6

    .line 78
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴ᩷()V

    .line 80
    :cond_6
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getState()Ll/ۜۡۗ;

    move-result-object v2

    sget-object v3, Ll/ۜۡۗ;->ܿ:Ll/ۜۡۗ;

    if-ne v2, v3, :cond_8

    .line 81
    sget-object v2, Ll/ۜۡۗ;->ᩳ:Ll/ۜۡۗ;

    invoke-virtual {p1, v2}, Ll/᩻ۡۗ;->ۙ(Ll/ۜۡۗ;)V

    .line 82
    iget-object v2, p0, Ll/֨ܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ۜۗ;

    .line 83
    invoke-static {v3, p1}, Ll/ۜ۠ۗ;->ۙ(Ll/۬ۜۗ;Ll/᩻ۡۗ;)V

    goto :goto_1

    .line 85
    :cond_7
    sget-object v2, Ll/ۜۡۗ;->۟:Ll/ۜۡۗ;

    invoke-virtual {p1, v2}, Ll/᩻ۡۗ;->ۙ(Ll/ۜۡۗ;)V

    :cond_8
    if-eqz p2, :cond_a

    .line 88
    invoke-static {}, Ll/ۘۧ᩵;->ۙ()V

    .line 89
    invoke-static {p1}, Ll/ۛ֡ۗ;->ۙ(Ll/᩻ۡۗ;)Ll/᩹ۘۗ;

    move-result-object v2

    .line 90
    sget-object v3, Ll/֫۟ۗ;->ܳۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 91
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۚ᩷()V

    .line 92
    sget-object v3, Ll/ۜۡۗ;->᩶:Ll/ۜۡۗ;

    invoke-virtual {p1, v3}, Ll/᩻ۡۗ;->ۙ(Ll/ۜۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :cond_9
    :try_start_1
    monitor-exit v0

    return-object v2

    .line 96
    :cond_a
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v2

    :goto_2
    if-nez p2, :cond_b

    .line 101
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Class process error: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 19
    invoke-static {p1, p2, v2}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    monitor-exit v0

    :goto_3
    return-object v1

    .line 99
    :cond_b
    throw v2

    .line 104
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 251
    iget-object v0, p0, Ll/֨ܿۗ;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 5

    .line 202
    iget-object v0, p0, Ll/֨ܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۜۗ;

    .line 204
    :try_start_0
    invoke-interface {v1, p1}, Ll/۬ۜۗ;->ۙ(Ll/֫ۖۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ll/֨ܿۗ;->᩷:Ll/᩻ܽ᩺;

    const-string v4, "Visitor init failed: {}"

    invoke-interface {v3, v4, v1, v2}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 6

    const-string v0, "MarkFinallyVisitor"

    .line 214
    iget-object v1, p0, Ll/֨ܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۬ۜۗ;

    .line 215
    invoke-interface {v4}, Ll/۬ۜۗ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v2, v3

    goto :goto_1

    :cond_0
    move-object v3, v4

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    return-void

    .line 232
    :cond_2
    invoke-virtual {p1}, Ll/ۖۡۗ;->۠ۙ()Ll/᩻ۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    monitor-enter v0

    .line 234
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩵᩷()V

    .line 235
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܶ᩷()V

    .line 236
    iget-object v1, p0, Ll/֨ܿۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ۜۗ;

    .line 237
    invoke-static {v3, p1}, Ll/ۜ۠ۗ;->ۙ(Ll/۬ۜۗ;Ll/ۖۡۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v2, :cond_3

    .line 239
    :try_start_1
    monitor-exit v0

    return-void

    .line 245
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 243
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to process method to visitor: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-direct {v1, v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    throw v1

    .line 246
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/᩻ۡۗ;)V
    .locals 4

    .line 141
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 143
    invoke-virtual {p0, v0}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 147
    :try_start_0
    invoke-direct {p0, p1, v0}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 149
    :goto_0
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to process class: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܽۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    throw v1
.end method

.method public final ᩷(Ll/᩻ۡۗ;)Ll/᩹ۘۗ;
    .locals 4

    .line 109
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 111
    invoke-virtual {p0, v0}, Ll/֨ܿۗ;->᩷(Ll/᩻ۡۗ;)Ll/᩹ۘۗ;

    move-result-object p1

    return-object p1

    .line 114
    :cond_0
    :try_start_0
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 115
    invoke-direct {p0, p1, v1}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;

    .line 116
    sget-object p1, Ll/֨ܿۗ;->ۤ:Ll/ᩴܰۗ;

    return-object p1

    .line 118
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۡۗ;

    .line 119
    invoke-direct {p0, v2, v1}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;

    goto :goto_0

    .line 121
    :cond_2
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 122
    invoke-direct {p0, p1, v1}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;

    .line 123
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۡۗ;

    .line 124
    invoke-direct {p0, v2, v1}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;

    goto :goto_1

    :cond_3
    const/4 v0, 0x1

    .line 127
    invoke-direct {p0, p1, v0}, Ll/֨ܿۗ;->ۙ(Ll/᩻ۡۗ;Z)Ll/᩹ۘۗ;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    .line 129
    :cond_4
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Codegen failed"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 129
    throw v0
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 133
    :goto_2
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to generate code for class: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܽۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    throw v1
.end method
