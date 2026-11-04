.class public final Ll/᩻᩸᩵;
.super Ll/ܺ۠ۗ;
.source "LIWJ"


# static fields
.field public static final ֡:Ll/᩻ܽ᩺;


# instance fields
.field public ܰ:Z

.field public ܿ:Ljava/util/HashSet;

.field public ᩶:Ll/֨ᩳۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Ll/᩻᩸᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/᩻᩸᩵;->֡:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;I)Ljava/lang/String;
    .locals 3

    .line 146
    invoke-virtual {p1, p2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p2

    .line 147
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p2, Ll/ܽ֨ۗ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    move-object v0, p2

    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    .line 152
    sget-object v2, Ll/᩺ۢۗ;->ۙۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_1

    .line 153
    check-cast v0, Ll/ۚۢۗ;

    invoke-virtual {v0}, Ll/ۚۢۗ;->getString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 155
    :cond_1
    sget-object v2, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_2

    .line 157
    check-cast v0, Ll/ۗۢۗ;

    invoke-virtual {v0}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ᩳۗ;

    .line 158
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p0

    invoke-virtual {p0, v0}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 160
    sget-object v0, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/ܳ᩶ۗ;

    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 161
    new-instance v0, Ll/ۚۢۗ;

    invoke-direct {v0, p0}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v0

    .line 162
    invoke-virtual {p1, p2, v0}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    .locals 5

    .line 104
    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_1

    .line 108
    :cond_0
    move-object v2, p2

    check-cast v2, Ll/᩶ۢۗ;

    invoke-virtual {v2}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v2

    .line 109
    iget-object v3, p0, Ll/᩻᩸᩵;->ܿ:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 112
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, v3, Ll/ۛ֨ۗ;

    if-nez v4, :cond_2

    goto :goto_1

    .line 116
    :cond_2
    check-cast v3, Ll/ۛ֨ۗ;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    .line 119
    invoke-static {p1, p2, v0}, Ll/᩻᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 121
    invoke-static {v3, p1}, Ll/᩻᩸᩵;->ۙ(Ll/ۛ֨ۗ;Ljava/lang/String;)Z

    move-result v2

    goto :goto_0

    :cond_3
    const/4 v4, 0x3

    if-ne v0, v4, :cond_4

    .line 125
    invoke-static {p1, p2, v1}, Ll/᩻᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 127
    invoke-static {v3, p1}, Ll/᩻᩸᩵;->ۙ(Ll/ۛ֨ۗ;Ljava/lang/String;)Z

    move-result v2

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 130
    iget-boolean p1, p0, Ll/᩻᩸᩵;->ܰ:Z

    if-eqz p1, :cond_5

    .line 131
    sget-object p1, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, p1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/ۛ֨ۗ;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "$this$"

    .line 170
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "$"

    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 137
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/۬֫᩵;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ۧ֨ۗ;->ۙ(Ljava/lang/String;)V

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 10

    const-string v0, "kotlin.jvm.internal.Intrinsics"

    .line 43
    invoke-static {v0}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v1

    invoke-static {p1, v1}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v1

    .line 427
    invoke-virtual {p1, v1}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v1

    const-string v2, "(Ljava/lang/Object;Ljava/lang/String;)V"

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 185
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 186
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۜ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻ۡۗ;

    .line 195
    invoke-virtual {v5}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v6

    .line 196
    invoke-virtual {v6}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Intrinsics"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 197
    invoke-virtual {v6}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_2

    .line 200
    :cond_2
    invoke-virtual {v6}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v6

    const-string v7, "kotlin.jvm.internal."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    .line 203
    :cond_3
    invoke-virtual {v5}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x5

    if-ge v6, v7, :cond_4

    goto :goto_0

    .line 207
    :cond_4
    invoke-virtual {v5}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۖۡۗ;

    .line 208
    invoke-virtual {v8}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 209
    invoke-virtual {v8}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_6
    const/4 v6, 0x2

    if-le v7, v6, :cond_1

    .line 188
    :goto_2
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 191
    :cond_7
    invoke-static {v1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/᩻ۡۗ;

    .line 64
    :goto_3
    sget-object v0, Ll/᩻᩸᩵;->֡:Ll/᩻ܽ᩺;

    if-eqz v1, :cond_c

    .line 65
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v4

    iput-object v4, p0, Ll/᩻᩸᩵;->᩶:Ll/֨ᩳۗ;

    .line 217
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 218
    invoke-virtual {v1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۖۡۗ;

    .line 219
    invoke-virtual {v6}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    .line 222
    :cond_9
    invoke-virtual {v6}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v7

    .line 223
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_a

    const-string v8, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 224
    :cond_a
    invoke-virtual {v6}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 66
    :cond_b
    iput-object v4, p0, Ll/᩻᩸᩵;->ܿ:Ljava/util/HashSet;

    .line 67
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "Kotlin Intrinsics class: {}, methods: {}"

    invoke-interface {v0, v4, v1, v2}, Ll/᩻ܽ᩺;->ۙ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_c
    const/4 v1, 0x0

    .line 69
    iput-object v1, p0, Ll/᩻᩸᩵;->᩶:Ll/֨ᩳۗ;

    const-string v1, "Kotlin Intrinsics class not found"

    .line 70
    invoke-interface {v0, v1}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;)V

    .line 72
    :goto_5
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۛۘۗ;->ܿ()Ll/ۨۘۗ;

    move-result-object p1

    sget-object v0, Ll/ۨۘۗ;->ܿ:Ll/ۨۘۗ;

    if-ne p1, v0, :cond_d

    const/4 v3, 0x1

    :cond_d
    iput-boolean v3, p0, Ll/᩻᩸᩵;->ܰ:Z

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 6

    .line 77
    iget-object v0, p0, Ll/᩻᩸᩵;->᩶:Ll/֨ᩳۗ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 80
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۡۗ;

    .line 87
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 91
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 92
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_4

    .line 94
    :try_start_0
    invoke-direct {p0, v0, v3}, Ll/᩻᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Failed to extract var names"

    .line 96
    invoke-virtual {v0, v4, v3}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_5
    const/4 p1, 0x1

    return p1
.end method
