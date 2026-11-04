.class public Ll/ۧܳۚ;
.super Ll/ܶᩴۚ;
.source "56XL"


# static fields
.field public static final ܿ:Ll/ܺᩴۚ;

.field public static final synthetic ᩶:I


# instance fields
.field public final ۘ:Ll/ۚᩳۚ;

.field public final ۛ:Ll/ۗ᩶ۚ;

.field public final ۨ:I

.field public final ܰ:Ll/֫ۨۚ;

.field public final ᩺:Ll/᩸ᩳۚ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x65

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const-string v0, "2025-06-18"

    const-string v1, "2025-03-26"

    .line 35
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܺᩴۚ;->ۙ([Ljava/lang/String;)Ll/ܺᩴۚ;

    move-result-object v0

    sput-object v0, Ll/ۧܳۚ;->ܿ:Ll/ܺᩴۚ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 7

    .line 71
    new-instance v2, Ll/֫ۨۚ;

    invoke-direct {v2}, Ll/֫ۨۚ;-><init>()V

    .line 78
    new-instance v3, Ll/ۗ᩶ۚ;

    new-instance v0, Ll/᩷ܿۚ;

    .line 79
    invoke-static {}, Ll/ᩴᩴۚ;->ۙ()Ll/᩸ᩴۚ;

    move-result-object v1

    invoke-static {}, Ll/ᩴᩴۚ;->᩷()Ll/ۢܿۚ;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Ll/᩷ܿۚ;-><init>(Ll/᩸ᩴۚ;Ll/ۢܿۚ;)V

    invoke-direct {v3, v0}, Ll/ۗ᩶ۚ;-><init>(Ll/᩷ܿۚ;)V

    new-instance v4, Ll/᩷ܿۚ;

    .line 80
    invoke-static {}, Ll/ᩴᩴۚ;->ۙ()Ll/᩸ᩴۚ;

    move-result-object v0

    invoke-static {}, Ll/ᩴᩴۚ;->᩷()Ll/ۢܿۚ;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Ll/᩷ܿۚ;-><init>(Ll/᩸ᩴۚ;Ll/ۢܿۚ;)V

    .line 85
    new-instance v5, Ll/֡ܿۚ;

    invoke-direct {v5, v4}, Ll/֡ܿۚ;-><init>(Ll/᩷ܿۚ;)V

    .line 90
    new-instance v6, Ll/ۚᩳۚ;

    .line 91
    invoke-static {}, Ll/ܶۘۚ;->ۤ()Ll/ܶۘۚ;

    move-result-object v0

    invoke-direct {v6, v4, v5, v0}, Ll/ۚᩳۚ;-><init>(Ll/᩷ܿۚ;Ll/֡ܿۚ;Ll/ܶۘۚ;)V

    move-object v0, p0

    move v1, p1

    .line 90
    invoke-direct/range {v0 .. v6}, Ll/ۧܳۚ;-><init>(ILl/֫ۨۚ;Ll/ۗ᩶ۚ;Ll/᩷ܿۚ;Ll/֡ܿۚ;Ll/ۚᩳۚ;)V

    return-void
.end method

.method public native constructor <init>(ILl/֫ۨۚ;Ll/ۗ᩶ۚ;Ll/᩷ܿۚ;Ll/֡ܿۚ;Ll/ۚᩳۚ;)V
.end method

.method public static native ۙ(Ll/֫ۨۚ;Ll/ۗ᩶ۚ;Ll/᩷ܿۚ;Ll/֡ܿۚ;Ll/ۚᩳۚ;)Ljava/util/List;
.end method

.method public static ۙ(Ll/ۗܳۚ;)Ll/֫ۨۚ;
    .locals 0

    .line 55
    invoke-static {}, Ll/ۛܳۚ;->ۙ()Ll/ۧܳۚ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 56
    :cond_0
    iget-object p0, p0, Ll/ۧܳۚ;->ܰ:Ll/֫ۨۚ;

    return-object p0
.end method

.method public static ۙ(Ll/᩵ܳۚ;)Ll/֫ۨۚ;
    .locals 0

    .line 47
    invoke-static {}, Ll/ۛܳۚ;->ۤ()Ll/ۧܳۚ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 48
    :cond_0
    iget-object p0, p0, Ll/ۧܳۚ;->ܰ:Ll/֫ۨۚ;

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;
    .locals 2

    .line 134
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ܺ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/mcp/files/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 135
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܶᩴۚ;->ۤ(Ll/ۗ᩻ܳ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    sget-object p1, Ll/᩶᩻ܳ;->ۡ:Ll/᩶᩻ܳ;

    const-string v0, "text/plain"

    const-string v1, "Origin is not allowed"

    invoke-static {p1, v0, v1}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object p1

    .line 148
    invoke-virtual {p1}, Ll/ܿ᩻ܳ;->ۙ()V

    return-object p1

    .line 136
    :cond_1
    iget-object v0, p0, Ll/ۧܳۚ;->᩺:Ll/᩸ᩳۚ;

    invoke-virtual {v0, p1}, Ll/᩸ᩳۚ;->ۙ(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;
    .locals 2

    .line 141
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ܺ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/mcp/files/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Ll/ܶᩴۚ;->᩷(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1

    .line 142
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܶᩴۚ;->ۤ(Ll/ۗ᩻ܳ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    sget-object p1, Ll/᩶᩻ܳ;->ۡ:Ll/᩶᩻ܳ;

    const-string v0, "text/plain"

    const-string v1, "Origin is not allowed"

    invoke-static {p1, v0, v1}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object p1

    .line 148
    invoke-virtual {p1}, Ll/ܿ᩻ܳ;->ۙ()V

    return-object p1

    .line 143
    :cond_1
    iget-object v0, p0, Ll/ۧܳۚ;->᩺:Ll/᩸ᩳۚ;

    invoke-virtual {v0, p1}, Ll/᩸ᩳۚ;->᩷(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸()V
    .locals 6

    const-string v0, "MT MCP smali cache shutdown failed"

    .line 164
    iget-object v1, p0, Ll/ۧܳۚ;->ܰ:Ll/֫ۨۚ;

    iget-object v2, p0, Ll/ۧܳۚ;->ۛ:Ll/ۗ᩶ۚ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "MT MCP server stop requested: port="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Ll/ۧܳۚ;->ۨ:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", wasStarted="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    invoke-virtual {p0}, Ll/֨᩻ܳ;->ᩴ()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", alive="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    invoke-virtual {p0}, Ll/֨᩻ܳ;->᩷()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", listeningPort="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    invoke-virtual {p0}, Ll/֨᩻ܳ;->ۙ()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/Throwable;

    const-string v5, "MT MCP server stop trace"

    invoke-direct {v4, v5}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 164
    invoke-static {v3, v4}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    iget-object v3, p0, Ll/ۧܳۚ;->ۘ:Ll/ۚᩳۚ;

    invoke-virtual {v3}, Ll/ۚᩳۚ;->close()V

    .line 171
    :try_start_0
    invoke-super {p0}, Ll/֨᩻ܳ;->᩸()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    invoke-virtual {v2}, Ll/ۗ᩶ۚ;->close()V

    .line 175
    :try_start_1
    invoke-virtual {v1}, Ll/֫ۨۚ;->ۤ()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 177
    invoke-static {v0, v1}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v3

    .line 173
    invoke-virtual {v2}, Ll/ۗ᩶ۚ;->close()V

    .line 175
    :try_start_2
    invoke-virtual {v1}, Ll/֫ۨۚ;->ۤ()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 177
    invoke-static {v0, v1}, Ll/᩵ܶۤ;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    :goto_0
    throw v3
.end method

.method public final ᩻()I
    .locals 1

    .line 156
    iget v0, p0, Ll/ۧܳۚ;->ۨ:I

    return v0
.end method
