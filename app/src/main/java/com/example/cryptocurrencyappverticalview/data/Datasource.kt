package com.example.cryptocurrencyappverticalview.data

import com.example.cryptocurrencyappverticalview.R
import com.example.cryptocurrencyappverticalview.model.Cryptocurrency

class Datasource {
    fun loadCryptocurrency(): List<Cryptocurrency> {
        return listOf<Cryptocurrency>(
            Cryptocurrency(R.string.bitcoin, R.string.bitcoin_year, R.drawable.bitcoin),
            Cryptocurrency(R.string.litecoin, R.string.litecoin_year, R.drawable.litecoin),
            Cryptocurrency(R.string.dogecoin, R.string.dogecoin_year, R.drawable.dogecoin),
            Cryptocurrency(R.string.bitcoinCash, R.string.bitcoinCash_year, R.drawable.bitcoincash),
            Cryptocurrency(R.string.feathercoin, R.string.feathercoin_year, R.drawable.feathercoin),
            Cryptocurrency(R.string.ethereum, R.string.ethereum_year, R.drawable.ethereum),
            Cryptocurrency(R.string.shibaInu, R.string.shibaInu_year, R.drawable.shiba),
            Cryptocurrency(R.string.stellar, R.string.stellar_year, R.drawable.stellar),
            Cryptocurrency(R.string.solana, R.string.solana_year, R.drawable.solana),
            Cryptocurrency(R.string.poligon, R.string.poligon_year, R.drawable.polygon)
        )
    }
}