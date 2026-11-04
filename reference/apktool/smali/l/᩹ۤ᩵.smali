.class public final Ll/᩹ۤ᩵;
.super Ll/۬᩷᩵;
.source "K6CN"


# instance fields
.field public final ۙ:Ll/ᩳۤ᩵;

.field public final ᩷:Ll/֡᩷᩵;


# direct methods
.method public constructor <init>(Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/᩹ۤ᩵;->᩷:Ll/֡᩷᩵;

    .line 23
    iput-object p2, p0, Ll/᩹ۤ᩵;->ۙ:Ll/ᩳۤ᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 3

    .line 28
    new-instance v0, Ll/ۗۤ᩵;

    iget-object v1, p0, Ll/᩹ۤ᩵;->᩷:Ll/֡᩷᩵;

    iget-object v2, p0, Ll/᩹ۤ᩵;->ۙ:Ll/ᩳۤ᩵;

    invoke-direct {v0, p1, v1, v2}, Ll/ۗۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ll/ᩳۤ᩵;)V

    return-object v0
.end method
