.class public final synthetic Ll/֨ۗۧ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/ܰۗ;

.field public final synthetic ֨:Ljava/lang/String;

.field public final synthetic ۖ:Ll/ܽۧۧ;

.field public final synthetic ۟:Ljava/lang/String;

.field public final synthetic ۡ:Ljava/lang/String;

.field public final synthetic ۢ:Ll/ܰۗ;

.field public final synthetic ܰ:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final synthetic ܿ:Ll/ܿܶۤ;

.field public final synthetic ᩳ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ۗۧܺ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ll/ۗۧܺ;Ll/ܿܶۤ;Ll/ܰۗ;Ljava/lang/String;Ljava/lang/String;Ll/ܰۗ;Ljava/lang/String;Ljava/lang/String;Ll/ܽۧۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۗۧ;->ܰ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-object p2, p0, Ll/֨ۗۧ;->᩶:Ll/ۗۧܺ;

    iput-object p3, p0, Ll/֨ۗۧ;->ܿ:Ll/ܿܶۤ;

    iput-object p4, p0, Ll/֨ۗۧ;->֡:Ll/ܰۗ;

    iput-object p5, p0, Ll/֨ۗۧ;->۟:Ljava/lang/String;

    iput-object p6, p0, Ll/֨ۗۧ;->ᩳ:Ljava/lang/String;

    iput-object p7, p0, Ll/֨ۗۧ;->ۢ:Ll/ܰۗ;

    iput-object p8, p0, Ll/֨ۗۧ;->֨:Ljava/lang/String;

    iput-object p9, p0, Ll/֨ۗۧ;->ۡ:Ljava/lang/String;

    iput-object p10, p0, Ll/֨ۗۧ;->ۖ:Ll/ܽۧۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1033
    new-instance v0, Ll/֡ܽۤ;

    invoke-direct {v0}, Ll/֡ܽۤ;-><init>()V

    .line 1034
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/֨ۗۧ;->ܰ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    .line 1036
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ᩹ۧ;

    if-nez v1, :cond_1

    goto/16 :goto_3

    .line 41
    :cond_1
    iget-object v2, p0, Ll/֨ۗۧ;->᩶:Ll/ۗۧܺ;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/ۗۧܺ;->ۙ(I)Z

    .line 1043
    invoke-interface {v1}, Ll/ܰ᩹ۧ;->᩸()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1045
    iget-object v4, p0, Ll/֨ۗۧ;->ܿ:Ll/ܿܶۤ;

    invoke-virtual {v4, v2}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object v4

    .line 1047
    invoke-virtual {v0}, Ll/֡ܽۤ;->᩷()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 1048
    :cond_2
    :goto_1
    invoke-virtual {v4}, Ll/ۘܶۤ;->find()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 1049
    invoke-virtual {v4}, Ll/ۘܶۤ;->group()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xa

    .line 1050
    invoke-virtual {v4}, Ll/ۘܶۤ;->start()I

    move-result v10

    invoke-virtual {v2, v9, v10}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v9

    add-int/2addr v9, v3

    const-string v10, "const-string"

    .line 1051
    invoke-virtual {v4}, Ll/ۘܶۤ;->start()I

    move-result v11

    invoke-static {v2, v10, v9, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_3

    goto :goto_1

    .line 1054
    :cond_3
    iget-object v9, p0, Ll/֨ۗۧ;->֡:Ll/ܰۗ;

    invoke-virtual {v9, v8}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_4

    .line 1055
    iget-object v10, p0, Ll/֨ۗۧ;->۟:Ljava/lang/String;

    if-eqz v10, :cond_4

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 0
    iget-object v9, p0, Ll/֨ۗۧ;->ᩳ:Ljava/lang/String;

    invoke-static {v9}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 1056
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    :cond_4
    if-eqz v9, :cond_2

    .line 1059
    invoke-virtual {v4}, Ll/ۘܶۤ;->start()I

    move-result v8

    invoke-virtual {v2, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/֡ܽۤ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1060
    invoke-virtual {v0, v9}, Ll/֡ܽۤ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1061
    invoke-virtual {v4}, Ll/ۘܶۤ;->end()I

    move-result v6

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    if-eqz v6, :cond_6

    .line 1066
    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֡ܽۤ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1067
    invoke-virtual {v0}, Ll/֡ܽۤ;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1070
    :cond_6
    invoke-virtual {v0}, Ll/֡ܽۤ;->᩷()V

    .line 1072
    new-instance v3, Ll/ۘۨۧ;

    invoke-direct {v3, v2}, Ll/ۘۨۧ;-><init>(Ljava/lang/String;)V

    .line 1073
    :cond_7
    :goto_2
    invoke-virtual {v3}, Ll/ۘۨۧ;->ۙ()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 1074
    iget-object v4, v3, Ll/ۘۨۧ;->ܳ:Ljava/lang/String;

    iget-object v6, p0, Ll/֨ۗۧ;->ۢ:Ll/ܰۗ;

    invoke-virtual {v6, v4}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_8

    .line 1075
    iget-object v6, p0, Ll/֨ۗۧ;->֨:Ljava/lang/String;

    if-eqz v6, :cond_8

    iget-object v8, v3, Ll/ۘۨۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v8, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 0
    iget-object v4, p0, Ll/֨ۗۧ;->ۡ:Ljava/lang/String;

    invoke-static {v4}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 1076
    iget-object v8, v3, Ll/ۘۨۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v8, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_8
    if-eqz v4, :cond_7

    .line 1079
    iget v6, v3, Ll/ۘۨۧ;->ᩴ:I

    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/֡ܽۤ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1081
    :try_start_0
    invoke-static {v0, v4}, Ll/ۗ᩶ۛ;->ۙ(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1085
    :catch_0
    iget v5, v3, Ll/ۘۨۧ;->ۙ:I

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_9
    if-eqz v5, :cond_a

    .line 1090
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֡ܽۤ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 1091
    invoke-virtual {v0}, Ll/֡ܽۤ;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_a
    if-lez v7, :cond_0

    .line 1094
    invoke-interface {v1, v2}, Ll/ܰ᩹ۧ;->ۙ(Ljava/lang/String;)V

    .line 1095
    iget-object v1, p0, Ll/֨ۗۧ;->ۖ:Ll/ܽۧۧ;

    invoke-virtual {v1, v7}, Ll/ܽۧۧ;->ۙ(I)V

    goto/16 :goto_0

    :cond_b
    :goto_3
    return-void
.end method
