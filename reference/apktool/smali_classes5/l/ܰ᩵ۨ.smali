.class public abstract Ll/ܰ᩵ۨ;
.super Ll/᩶۬᩹;
.source "E7IO"

# interfaces
.implements Ll/᩹۬᩹;


# instance fields
.field public final ۙ:Ll/ܽۚۧ;


# direct methods
.method public constructor <init>(Ll/ۗ᩵ۨ;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ll/᩶۬᩹;-><init>()V

    .line 89
    new-instance p1, Ll/ܽۚۧ;

    invoke-direct {p1, p0}, Ll/ܽۚۧ;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܰ᩵ۨ;->ۙ:Ll/ܽۚۧ;

    return-void
.end method


# virtual methods
.method public final visitFileFailed(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܶ۬᩹;
    .locals 1

    .line 34
    check-cast p1, Ll/᩺۬᩹;

    .line 103
    iget-object v0, p0, Ll/ܰ᩵ۨ;->ۙ:Ll/ܽۚۧ;

    iget-object v0, v0, Ll/ܽۚۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܰ᩵ۨ;

    .line 89
    invoke-super {v0, p1, p2}, Ll/᩶۬᩹;->visitFileFailed(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܶ۬᩹;

    move-result-object p1

    return-object p1
.end method
