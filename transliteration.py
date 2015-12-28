# uses library transliterate.
# You need to install that one first ;-)
# Note: georgian (ka) officially has no caps, but transliterate uses them. Use .lower() to avoid that.


import transliterate as tl

lst_strings_lt_ka = [
    'tsminda sameba',
    'Tsminda Sameba',
]
print('From Latin to Kartvelian\n=====')
for item in lst_strings_lt_ka:
    print(item + ' => ' + tl.translit(item, 'ka'))


lst_strings_ka_lt = [
    'ტელეკომუნიკაცია და ინტერნეტი',

]
print('\nFrom Kartvelian to Latin\n=====')
for item in lst_strings_ka_lt:
    print(item + ' => ' + tl.translit(item, 'ka', True))

lst_strings_ka_ru = [
    'ტელეკომუნიკაცია და ინტერნეტი',

]
print('\nFrom Kartvelian to Russian\n=====')
for item in lst_strings_ka_ru:
    print(item + ' => ' + tl.translit(tl.translit(item, 'ka', True), 'ru'))


