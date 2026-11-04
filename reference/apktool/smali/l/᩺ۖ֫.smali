.class public final Ll/᩺ۖ֫;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ljava/lang/String;

.field public ֨:Ll/ܶۖ֫;

.field public final ֫ۙ:Ljava/lang/String;

.field public final ۖ:Ljava/util/Map;

.field public ۙۙ:Ljava/lang/String;

.field public ۚۙ:Z

.field public final ۜ:Z

.field public ۟:Ljava/lang/String;

.field public ۠:I

.field public final ۡ:Z

.field public ۢ:Ljava/lang/String;

.field public ۤۙ:Ljava/lang/String;

.field public final ۧۙ:Ll/۟ۘܳ;

.field public ۫ۙ:Ll/᩸ۧܳ;

.field public final ۬:Ll/ᩳ۬֫;

.field public volatile ܰ:Z

.field public final ܳۙ:Ljava/util/ArrayList;

.field public ܿ:Z

.field public ᩳ:Ljava/lang/String;

.field public ᩴۙ:Ljava/util/List;

.field public final ᩶:Z

.field public ᩷ۙ:Ll/ۖ֫ܳ;

.field public final ᩸ۙ:Ll/᩷ۨᩴ;

.field public final ᩻ۙ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۟ۘܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLl/᩷ۨᩴ;Z)V
    .locals 4

    .line 2128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2104
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/᩺ۖ֫;->ᩴۙ:Ljava/util/List;

    const/4 v0, -0x1

    .line 2106
    iput v0, p0, Ll/᩺ۖ֫;->۠:I

    .line 2107
    new-instance v0, Ll/ᩳ۬֫;

    invoke-direct {v0}, Ll/ᩳ۬֫;-><init>()V

    iput-object v0, p0, Ll/᩺ۖ֫;->۬:Ll/ᩳ۬֫;

    .line 2109
    sget-object v0, Ll/ܶۖ֫;->֡:Ll/ܶۖ֫;

    iput-object v0, p0, Ll/᩺ۖ֫;->֨:Ll/ܶۖ֫;

    .line 2111
    new-instance v0, Ll/ۛۖ֫;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x10

    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    invoke-static {v0}, Ll/ۙۚۗ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۖ֫;->ۖ:Ljava/util/Map;

    .line 2115
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۖ֫;->֡:Ljava/lang/String;

    .line 2118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩺ۖ֫;->ܳۙ:Ljava/util/ArrayList;

    .line 2129
    iput-object p1, p0, Ll/᩺ۖ֫;->ۧۙ:Ll/۟ۘܳ;

    .line 2130
    iput-object p2, p0, Ll/᩺ۖ֫;->ۤۙ:Ljava/lang/String;

    .line 2131
    iput-object p3, p0, Ll/᩺ۖ֫;->ۢ:Ljava/lang/String;

    .line 2132
    iput-object p4, p0, Ll/᩺ۖ֫;->᩻ۙ:Ljava/lang/String;

    .line 2133
    iput-object p5, p0, Ll/᩺ۖ֫;->֫ۙ:Ljava/lang/String;

    .line 2134
    iput-boolean p6, p0, Ll/᩺ۖ֫;->ۡ:Z

    .line 2135
    iput-boolean p7, p0, Ll/᩺ۖ֫;->ۜ:Z

    .line 2136
    iput-object p8, p0, Ll/᩺ۖ֫;->᩸ۙ:Ll/᩷ۨᩴ;

    .line 2137
    iput-boolean p9, p0, Ll/᩺ۖ֫;->᩶:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ۖ֫;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->ۖ:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic ۗ(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->֫ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۖ֫;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺ۖ֫;->۠:I

    return-void
.end method

.method public static ۙ(Ll/᩺ۖ֫;Landroid/content/Context;Ll/᩸ۖ֫;)V
    .locals 1

    .line 2142
    iget-object v0, p0, Ll/᩺ۖ֫;->۫ۙ:Ll/᩸ۧܳ;

    if-eqz v0, :cond_0

    .line 2143
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p0}, Ll/᩸ۖ֫;->accept(Ljava/lang/Object;)V

    return-void

    .line 2146
    :cond_0
    iget-object v0, p0, Ll/᩺ۖ֫;->ܳۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2147
    iget-boolean p2, p0, Ll/᩺ۖ֫;->ۚۙ:Z

    if-eqz p2, :cond_1

    return-void

    :cond_1
    const/4 p2, 0x1

    .line 2148
    iput-boolean p2, p0, Ll/᩺ۖ֫;->ۚۙ:Z

    .line 2149
    iget-boolean p2, p0, Ll/᩺ۖ֫;->ۜ:Z

    if-nez p2, :cond_3

    iget p2, p0, Ll/᩺ۖ֫;->۠:I

    if-ltz p2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p2, p0, Ll/᩺ۖ֫;->᩷ۙ:Ll/ۖ֫ܳ;

    iget-object v0, p0, Ll/᩺ۖ֫;->ۤۙ:Ljava/lang/String;

    invoke-static {p2, v0}, Ll/ᩴۧܳ;->ۙ(Ll/ۖ֫ܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p2, 0x0

    .line 2150
    :goto_1
    invoke-static {p1}, Ll/ᩴۧܳ;->ۙ(Landroid/content/Context;)Ll/ᩴۧܳ;

    move-result-object p1

    new-instance v0, Ll/ۨۖ֫;

    invoke-direct {v0, p0}, Ll/ۨۖ֫;-><init>(Ll/᩺ۖ֫;)V

    invoke-virtual {p1, p2, v0}, Ll/ᩴۧܳ;->ۙ(Ljava/lang/String;Ll/ۨۖ֫;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۖ֫;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۖ֫;->۟:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۖ֫;Ljava/util/List;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۖ֫;->ᩴۙ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۖ֫;Ll/ۖ֫ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۖ֫;->᩷ۙ:Ll/ۖ֫ܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۖ֫;Ll/ܶۖ֫;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۖ֫;->֨:Ll/ܶۖ֫;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩺ۖ֫;Ll/᩸ۧܳ;)V
    .locals 3

    .line 2151
    iget-object v0, p0, Ll/᩺ۖ֫;->ܳۙ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ll/᩺ۖ֫;->ۚۙ:Z

    .line 2152
    iget-boolean v1, p0, Ll/᩺ۖ֫;->ܿ:Z

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩸ۧܳ;->close()V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 2154
    iput-object p1, p0, Ll/᩺ۖ֫;->۫ۙ:Ll/᩸ۧܳ;

    .line 2155
    iget-object v1, p1, Ll/᩸ۧܳ;->᩶:Ljava/lang/String;

    iput-object v1, p0, Ll/᩺ۖ֫;->ᩳ:Ljava/lang/String;

    .line 2157
    :cond_1
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2158
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2159
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/function/Consumer;

    iget-boolean v2, p0, Ll/᩺ۖ֫;->ܿ:Z

    if-nez v2, :cond_2

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺ۖ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺ۖ֫;->ܰ:Z

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/᩺ۖ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺ۖ֫;->ۡ:Z

    return p0
.end method

.method public static bridge synthetic ۛ(Ll/᩺ۖ֫;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/᩺ۖ֫;->ܰ:Z

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->֡:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۖ֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩺ۖ֫;->۠:I

    return p0
.end method

.method public static bridge synthetic ۨ(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->᩻ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/᩺ۖ֫;)Ll/ܶۖ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->֨:Ll/ܶۖ֫;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->ۢ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܶ(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->ۤۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/᩺ۖ֫;)Ll/ᩳ۬֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->۬:Ll/ᩳ۬֫;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩺ۖ֫;)Ll/ۖ֫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->᩷ۙ:Ll/ۖ֫ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->ᩳ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩵(Ll/᩺ۖ֫;)Ll/۟ۘܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->ۧۙ:Ll/۟ۘܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩺ۖ֫;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۖ֫;->ۙۙ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩺ۖ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺ۖ֫;->᩶:Z

    return p0
.end method

.method public static bridge synthetic ᩸(Ll/᩺ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->۟:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩹(Ll/᩺ۖ֫;)Ll/᩷ۨᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۖ֫;->᩸ۙ:Ll/᩷ۨᩴ;

    return-object p0
.end method

.method public static ᩺(Ll/᩺ۖ֫;)Z
    .locals 4

    .line 2165
    iget-object v0, p0, Ll/᩺ۖ֫;->۬:Ll/ᩳ۬֫;

    iget-object v1, p0, Ll/᩺ۖ֫;->ۙۙ:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v3, p0, Ll/᩺ۖ֫;->᩷ۙ:Ll/ۖ֫ܳ;

    if-nez v3, :cond_0

    goto :goto_0

    .line 2166
    :cond_0
    invoke-virtual {v3, v1}, Ll/ۖ֫ܳ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ۖ֫;->ۢ:Ljava/lang/String;

    .line 2167
    iget-object v1, p0, Ll/᩺ۖ֫;->ۙۙ:Ljava/lang/String;

    iput-object v1, p0, Ll/᩺ۖ֫;->ۤۙ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 2168
    iput-object v1, p0, Ll/᩺ۖ֫;->ۙۙ:Ljava/lang/String;

    .line 2169
    iget-object v3, p0, Ll/᩺ۖ֫;->ۖ:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 2170
    iget-object v3, v0, Ll/ᩳ۬֫;->ۙ:Ljava/util/Map;

    check-cast v3, Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    .line 2171
    iput-boolean v2, v0, Ll/ᩳ۬֫;->᩷:Z

    .line 2172
    iget-object v0, p0, Ll/᩺ۖ֫;->۫ۙ:Ll/᩸ۧܳ;

    if-eqz v0, :cond_1

    .line 2173
    invoke-virtual {v0}, Ll/᩸ۧܳ;->close()V

    .line 2174
    iput-object v1, p0, Ll/᩺ۖ֫;->۫ۙ:Ll/᩸ۧܳ;

    .line 2176
    :cond_1
    iput-object v1, p0, Ll/᩺ۖ֫;->ᩳ:Ljava/lang/String;

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v2
.end method

.method public static bridge synthetic ᩻(Ll/᩺ۖ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺ۖ֫;->ۜ:Z

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 2185
    iget-boolean v0, p0, Ll/᩺ۖ֫;->ܿ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 2186
    iput-boolean v0, p0, Ll/᩺ۖ֫;->ܿ:Z

    .line 2187
    iget-object v0, p0, Ll/᩺ۖ֫;->۫ۙ:Ll/᩸ۧܳ;

    if-eqz v0, :cond_1

    .line 2188
    invoke-virtual {v0}, Ll/᩸ۧܳ;->close()V

    const/4 v0, 0x0

    .line 2189
    iput-object v0, p0, Ll/᩺ۖ֫;->۫ۙ:Ll/᩸ۧܳ;

    .line 2191
    :cond_1
    sget-object v0, Ll/ۘۖ֫;->ܽۤ:Ll/ۗۖ֫;

    .line 352
    iget-object v0, p0, Ll/᩺ۖ֫;->ۧۙ:Ll/۟ۘܳ;

    instance-of v1, v0, Ljava/lang/AutoCloseable;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/AutoCloseable;

    .line 354
    :try_start_0
    check-cast v0, Ljava/lang/AutoCloseable;

    invoke-static {v0}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2192
    :catch_0
    :cond_2
    iget-object v0, p0, Ll/᩺ۖ֫;->ᩴۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/ۜ᩵ܳ;->ۙ(J)V

    goto :goto_0

    .line 2193
    :cond_3
    iget-object v0, p0, Ll/᩺ۖ֫;->᩸ۙ:Ll/᩷ۨᩴ;

    if-eqz v0, :cond_4

    .line 2194
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    :cond_4
    :goto_1
    return-void
.end method
