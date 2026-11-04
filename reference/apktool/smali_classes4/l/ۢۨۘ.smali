.class public final enum Ll/ۢۨۘ;
.super Ll/۟ۛۘ;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܿۛۘ;Ll/᩶ۛۘ;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 581
    invoke-direct/range {v0 .. v8}, Ll/۟ۛۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܿۛۘ;Ll/᩶ۛۘ;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܿۛۘ;Ll/᩶ۛۘ;)V
    .locals 8

    const-string v4, "opt.arg.plugin"

    const-string v5, "opt.plugin"

    const-string v1, "PLUGIN"

    const/16 v2, 0x42

    const-string v3, "-Xplugin:"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/ۢۨۘ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܿۛۘ;Ll/᩶ۛۘ;)V

    return-void
.end method


# virtual methods
.method public ۙ(Ll/ۢۛۘ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 584
    sget-object p2, Ll/۟ۛۘ;->ܳ᩷:Ll/۟ۛۘ;

    invoke-virtual {p1, p2}, Ll/ۢۛۘ;->ۙ(Ll/۟ۛۘ;)Ljava/lang/String;

    move-result-object v0

    .line 585
    iget-object p2, p2, Ll/۟ۛۘ;->ۡ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 0
    invoke-static {v1, v0, p3}, Ll/۟ܺ᩹;->ۙ(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 585
    :goto_0
    invoke-virtual {p1, p2, p3}, Ll/ۢۛۘ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
